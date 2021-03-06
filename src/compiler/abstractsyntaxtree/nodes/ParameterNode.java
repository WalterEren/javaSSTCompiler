package compiler.abstractsyntaxtree.nodes;

import static compiler.symboltable.Type.Int;

import compiler.abstractsyntaxtree.INode;
import compiler.abstractsyntaxtree.NodeClasz;
import compiler.symboltable.Objekt;

public class ParameterNode
                extends INode
{
    private static int DOT_COUNTER = 0;

    public ParameterNode( String name, Objekt obj )
    {
        this.nodeClasz = NodeClasz.PARA;
        this.type = Int;

        this.name = name;
        this.dotName = name + "_" + DOT_COUNTER++;
        this.obj = obj;
    }
}
