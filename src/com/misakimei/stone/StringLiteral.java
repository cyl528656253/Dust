package com.misakimei.stone;

import com.misakimei.stone.type.TypeEnv;
import com.misakimei.stone.type.TypeException;
import com.misakimei.stone.type.TypeInfo;
import com.misakimei.stone.vm.Code;
import static com.misakimei.stone.vm.Opcode.SCONST;
import static com.misakimei.stone.vm.Opcode.encodeRegister;
import static com.misakimei.stone.vm.Opcode.encodeShortOffset;

/**
 * Created by 18754 on 2016/7/27.
 */
public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) {
        super(t);
    }
    public String value(){
        return token().getText();
    }

    @Override
    public Object eval(Environment env) {
        return value();
    }

    @Override
    public TypeInfo typecheck(TypeEnv tenv) throws TypeException {
        return TypeInfo.STRING;
    }
}
