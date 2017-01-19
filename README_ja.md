# StatePatternPractice
## これなに
研究で作っている SDN Controller の状態遷移マシンを Android で実装してみたもの．  
デザインパターンの Stete パターンや Singleton パターンを使用してみた．

## State パターン
必要なのは状態を示す interface とその interface を implements した object，状態変数を持つ context クラス．

### interface
ここで定義したメソッドがイベントになる．

```kotlin
interface ConnectionState {
    fun hoge()
}
```

### object
```kotlin
object Listen : ConnectionState {
    override fun hoge() {
    // 動作
    }
}
```

### context
```kotlin
class ConnectionStateContext() {

    private var state: ConnectionState = Listen

    fun setState(state: ConnectionState) {
        this.state = state
    }

    fun hoge() {
        state.hoge()
    }
}
```

### fragment
今回は Fragment で context を保持してボタンでイベントを発行するように実装．

```kotlin
class ConnectionFragment : Fragment() {

    private lateinit var binding: FragmentConnectionBinding
    private lateinit var context: ConnectionStateContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentConnectionBinding.inflate(inflater, container, false)
        initView()
        context = ConnectionStateContext()
        return binding.root
    }

    fun initView() {
        binding.button.setOnClickListener {
            context.hoge()
        }
    }
}
```

## Singleton パターン
Kotlin の場合は class の代わりに Object 宣言することでシングルトンになる．

### 例
```kotlin
object Listen : ConnectionState {

}
```

## License
```
Copyright 2017 yuzumone

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```