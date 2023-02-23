

class Pra_7{
   int hour,minute,second;
 
   public Pra_7()
   {
       hour=0;
       minute=0;
       second=0;
   }
   
  void gettime(int h,int m,int s)
  {
   hour = h;
   minute = m;
   second = s; 
  }
  
  void showTime()
  {
     System.out.println(hour+" "+minute+" "+second);
  }

   void addtime(Pra_7 t1,Pra_7 t2)
  { 
     second=t1.second+t2.second;
     minute=t1.minute+t2.minute;
     hour=t1.hour+t2.hour;
    
     if(second>=60)
     {
         second=second-60;
         minute=minute+1;
     }

     if(minute>=60)
     {
         minute=minute-60;
         hour=hour+1;
     }

    
 }
 
 public static void main(String[] args) {
       
    Pra_7 t1=new Pra_7();
    Pra_7 t2=new Pra_7();
    Pra_7 t3=new Pra_7();

    t1.gettime(5, 25, 10);
    t2.gettime(5, 40, 60);
    
    t3.addtime(t1,t2);
    t1.showTime();
    t2.showTime();
    t3.showTime();
}

}

