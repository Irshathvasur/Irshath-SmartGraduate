package Practicecodes.Java.Closedbook;

public class Datacasting {

    public static void main(String[] args) {
        byte b=0,bv=120;
        short s=0,sv=12365;
        int i=0,iv=1232445;
        long l=0,lv=21434354l;
        float f=0,fv=232.3435f;
        double d=0,dv=394434.35454d;
        char c=' ',cv='e';
        //boolean bool=false,boolt=true;

        //Byte
        //b=s;b=i;b=l;b=f;b=d;b=c;b=bool;
        //Type mismatch
        b=(byte)s;b=(byte)i;b=(byte)l;b=(byte)f;b=(byte)d;b=(byte)c;//b=(byte)bool;
        //Can not cast bool into byte
        bv=(byte)sv;bv=(byte)iv;bv=(byte)lv;bv=(byte)fv;bv=(byte)dv;bv=(byte)cv;//b=(byte)boolt;
        //Same result as before

        //Short
        s=b;//s=i;s=l;s=f;s=d;s=c;s=bool;
        //Accepts byte as it's smaller, doesn't accept anything else
        s=(short)b;s=(short)i;s=(short)l;s=(short)f;s=(short)d;s=(short)c;//s=(short)bool;
        //Can not cast bool into short
        sv=(short)bv;sv=(short)iv;sv=(short)lv;sv=(short)fv;sv=(short)dv;sv=(short)cv;//sv=(short)boolt;
        //Same result as before

        //Int
        i=b;i=s;//i=l;i=f;i=d;
        i=c;//i=bool;
        //Accepts byte short and char
        i=(int)b;i=(int)s;i=(int)l;i=(int)f;i=(int)d;i=(int)c;//i=(int)bool;
        //Can not cast bool into int
        iv=(int)bv;iv=(int)sv;iv=(int)lv;iv=(int)fv;iv=(int)dv;iv=(int)cv;//iv=(int)boolt;
        //Same result as before

        //Long
        l=b;l=s;l=i;
        //l=f;l=d;
        l=c;//l=bool;
        //Accepts byte int short and char 
        l=(long)b;l=(long)s;l=(long)i;l=(long)f;l=(long)d;l=(long)c;//l=(long)bool;
        //Can not cast bool into long
        lv=(long)bv;lv=(long)sv;lv=(long)iv;lv=(long)fv;lv=(long)dv;lv=(long)cv;//lv=(long)boolt;
        //Same result as before

        //Float
        f=b;f=s;f=i;f=l;//f=d;
        f=c;//f=bool;
        //Doesn't accept double and boolean
        f=(float)b;f=(float)s;f=(float)i;f=(float)l;f=(float)d;f=(float)c;//f=(float)bool;
        //Can not cast bool into float
        fv=(float)bv;fv=(float)sv;fv=(float)iv;fv=(float)lv;fv=(float)dv;fv=(float)cv;//fv=(float)boolt;
        //Same result as before

        //Double
        d=b;d=s;d=i;d=l;d=f;d=c;//d=bool;
        //Doesn't accept boolean
        d=(double)b;d=(double)s;d=(double)i;d=(double)l;d=(double)f;d=(double)c;//d=(double)bool;
        //Can not cast bool into double
        dv=(float)bv;dv=(float)sv;dv=(float)iv;dv=(float)lv;dv=(float)fv;dv=(float)cv;//dv=(float)boolt;
        //Same result as before

        //Char
        //c=b;c=s;c=i;c=l;c=f;c=d;c=bool;
        //Doesn't accept anything
        c=(char)b;c=(char)s;c=(char)i;c=(char)l;c=(char)f;c=(char)c;//c=(char)bool;
        //Can not cast bool into char
        cv=(char)bv;cv=(char)sv;cv=(char)iv;cv=(char)lv;cv=(char)dv;cv=(char)cv;//cv=(char)boolt;
        //Same result as before

        //Boolean
        //bool=b;bool=s;bool=i;bool=l;bool=f;bool=d;bool=c;
        //Doesn't accept anything
        //bool=(boolean)b;bool=(boolean)s;bool=(boolean)i;bool=(boolean)l;bool=(boolean)f;bool=(boolean)d;bool=(boolean)c;
        //Doesn't accept anything
        //boolt=(boolean)bv;boolt=(boolean)sv;boolt=(boolean)iv;boolt=(boolean)lv;boolt=(boolean)fv;boolt=(boolean)dv;boolt=(boolean)cv;
        //Doesn't accept anything
        }
}
