.assembly extern mscorlib {}
.assembly EXEMPLO{}
.module EXEMPLO

.class private auto ansi beforefieldinit EXEMPLO
       extends [mscorlib]System.Object 
{

.field public static int32 X
.field public static int32 N

.method public hidebysig static int32 FATORIAL(int32 A) cil managed 
{
  ldarg		A
  ldc.i4	1
  ceq
  ldarg		A
  ldc.i4	0
  ceq
  or
  brfalse	ELSE_1
  ldc.i4	1
  ret
  br.s		OUT_1
  ELSE_1:
  ldarg		A
  ldarg		A
  ldc.i4	1
  sub
  call		int32 EXEMPLO::FATORIAL(int32)
  mul
  ret
  OUT_1:
  ret
}

.method public hidebysig static void Main() cil managed 
{
  .entrypoint
  .maxstack  500


  BEGIN_2:

  ldstr		"Bem vindo ao teste master do compilador glb"
  call		void [mscorlib]System.Console::WriteLine(string)
  ldstr		"Digite 1: Para Chamar a funcao fatorial"
  call		void [mscorlib]System.Console::WriteLine(string)
  ldstr		"Digite 2: Para Sair"
  call		void [mscorlib]System.Console::WriteLine(string)
  call		string [mscorlib]System.Console::ReadLine()
  call		int32 [mscorlib]System.Int32::Parse(string)
  stsfld	int32 EXEMPLO::X
  ldsfld	int32 EXEMPLO::X
  ldc.i4	1
  ceq
  brfalse	ELSE_3
  ldstr		"Digita um numero que eu mando o fatorial !"
  call		void [mscorlib]System.Console::WriteLine(string)
  ldstr		"Se liga champz um numero menor que 15... int32"
  call		void [mscorlib]System.Console::WriteLine(string)
  call		string [mscorlib]System.Console::ReadLine()
  call		int32 [mscorlib]System.Int32::Parse(string)
  stsfld	int32 EXEMPLO::N
  ldstr		"resultado: "
  call		void [mscorlib]System.Console::WriteLine(string)
  ldsfld	int32 EXEMPLO::N
  call		int32 EXEMPLO::FATORIAL(int32)
  call		void [mscorlib]System.Console::WriteLine(int32)
  ldstr		""
  call		void [mscorlib]System.Console::WriteLine(string)
  br.s		OUT_3
  ELSE_3:
  ldstr		"voce digitou: "
  call		void [mscorlib]System.Console::WriteLine(string)
  ldsfld	int32 EXEMPLO::X
  call		void [mscorlib]System.Console::WriteLine(int32)
  OUT_3:
  ldsfld	int32 EXEMPLO::X
  ldc.i4	2
  ceq; ldc.i4 1; xor
  brtrue	BEGIN_2
  OUT_2:
  ret
}
}
