package getacar;

public class Technology {
    
    public boolean internet;
    public boolean tv;

    public Technology() {
        internet = true;
        tv = true;
    }
    
    public Technology(boolean internet, boolean tv) {
        internet = this.internet;
        tv = this.tv;
    }
    
    @Override
    public String toString()
    {
        if (internet && tv)
            return("Internet: Yes\nTV: Yes\n");
        else if (!internet && !tv)
            return("Internet: No\nTV: No\n");
        else if (internet && !tv)
            return("Internet: Yes\nTV: No\n");
        else
            return("Internet: No\nTV: Yes\n");
    }
   
    
}
