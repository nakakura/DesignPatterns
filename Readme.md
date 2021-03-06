#DesignPatterns
==============
デザインパターン自体やその根底の大原則について、
Scalaの勉強を兼ねてコードを書いてみるテスト。
気が向いたときにボチボチ更新。

## DependencyInversionPrinciple
	依存性逆転の原則
	実装する際、何も考えずに書くと、オブジェクトの呼び出し元(Button)が
	呼び出し先のクラス(Lamp)の内部実装を直接呼び出すような記載になりがち。
	このような実装になっていると、換気扇を同じボタンクラスで操作するようなコードを追加するとき、
	ボタンクラスに換気扇クラスの実装に沿った拡張を追加しなければならない。
	
	それはめんどうなので、ボタンの側で呼び出し先のインタフェースを定義してしまう。
	ボタンの側から「こういうインタフェースに沿って実装してくれたら呼び出せる」と通知し、
	ランプと換気扇はそれを参照して実装する。
	
	こういう書き方に変更することで、元々の参照方向が「ボタン ->　ランプ」であったのに対し、
	「ランプ -> ボタン」への参照に変化する。
	これを依存性逆転という。
	実装に対して実装するのではなく、抽象に対して実装した方がいいよという大原則が守れる。
	

## Template
	いわゆるテンプレ。
	BubbleSortTemplateにバブルソートのアルゴリズムだけ書いておく。
	これをテンプレとしてそのまま使ってしまえば、
	それを継承したIntBubbleSorterでは整数値のソートが、
	StringBubbleSorterでは文字列のソートができてしまう。
	素直に継承を使って書く場合は大体こうなる。
	

## Strategy
	既にBubbleSortのアルゴリズムだけ書いたクラスがあるんだったら、
	ぼくのクラスをそのサブクラスにわざわざしなくても、
	単にそのクラス呼び出せばソートできるよね？
	あとは追加したい機能を別途加えてやればいいじゃん。
	という考え方での拡張。
	
	デザインパターンの原則の一つに、
	"Is a"(継承)よりも"Has a"(コンポジション)の方がよい。
	という考え方がありそれに乗っ取って書くとこうなる。
	クラスを継承して書くと、親クラスの変更に対してサブクラスに与える影響が大きくなる
	(抽象クラスを追加されたら実装しなきゃいけないとか。)
	ので、ヘタに継承するくらいならパーツとして使っちゃった方がいいよね、ということ。
			

## Command
	コマンドパターン。ロジックをカプセル化する。
	リモコンやセンサーオブジェクトの中で、操作対象の仕様を知る必要は無い。
	コマンドオブジェクトとして渡しておいて、事前に認識しているインタフェースだけ呼び出してもらえば、
	実装がより疎結合になる。
		

## Factory
	ファクトリ。
	Commandパターンとかで大量のクラスを利用するとき、
	実際に疎結合に組むためには、オブジェクトの生成規則についても把握しないほうがよい。
	そういう場合には生成専門のパターンとして分離しておく。
	例えば、ネットワークソケットで受信したパラメータをFactoryにほりこんでパースしてもらい、
	その後の処理は生成したクラスにやってもらえば、
	ソケットをもっている通信クラスでは受信したパラメータの処理について知る必要はない。
	

## Observer
	オブザーバ。
	最初に観察者として登録して、データのアップデートがあった場合はデータを受け取れる。
	このデザインの長所は、観察者側も報告者側も相手のクラスの内部設計を把握しなくていいことである。
	この例では、部屋の気象センサーが温度と湿度を観測し、そのデータを元に家電が状態を変更している。
	愚直に設計すると、センサー側でヒーターのsetTemperatureメソッド, 加湿器のsetHumidメソッドを呼ぶように設計しなければならない。
	追加で追加でクーラーを買ったらクーラーのsetTemperatureメソッドを実行するようにしなければならないし、
	もしかしたらクーラーが日本製でsetKionメソッドを呼ばないといけないかもしれない。
	これでは保守性が下がってしまう。
	Observerデザインを使うことで、最初に家電はセンサーに対してObserverとして登録し、
	センサーは延々とupdateメソッドを実行するだけでよい。
	受け取る側は受け取ったデータだけを見ればいいので、センサーの仕様は考えなくて良い。
	別のセンサーに登録するのも簡単である。
	
