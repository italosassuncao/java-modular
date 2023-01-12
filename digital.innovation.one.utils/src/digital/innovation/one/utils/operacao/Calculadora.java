package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.DivHelper;
import digital.innovation.one.utils.operacao.internal.MultiHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;
import digital.innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper DivHelper;
    private MultiHelper MultiHelper;
    private SubHelper SubHelper;
    private SumHelper SumHelper;

    public Calculadora() {
        DivHelper = new DivHelper();
        MultiHelper = new MultiHelper();
        SubHelper = new SubHelper();
        SumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return SumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return SubHelper.execute(a,b);
    }

    public int multi(int a, int b){
        return MultiHelper.execute(a,b);
    }

    public int div(int a, int b){
        return DivHelper.execute(a,b);
    }
}
