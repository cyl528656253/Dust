package com.misakimei.stone.Interpreter;

import com.misakimei.stone.FuncParse;
import com.misakimei.stone.NestEnv;

/**
 * Created by 18754 on 2016/7/29.
 */
public class FuncInterpreter extends BasicInterpreter{

    public static void main(String[] args) {
        run(new FuncParse(),new NestEnv(),"./data/fun.stone");
    }
}
