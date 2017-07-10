/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

/**
 *
 * @author pc
 */
import java.lang.*; 
import java.io.*; 

public class AdivinaNumero { 
void LIMPIA() { 
for (int i=0; i<80;i++) 
System.out.println(); 
} 
static String leerDato() 
{ 
BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in)); 
String dato=""; 
try 
{ 
dato=teclado.readLine(); 
}catch (IOException error){}; 
return dato; 
} 
void tabla(int a) 
{ 
if(a==1) 
{ 
System.out.println(1+" "+3+" "+5+" "+7+" "+9+" "+11+" "+13+" "+15+" "+17+" "+19);
System.out.println(21+" "+23+" "+25+" "+27+" "+29+" "+31+" "+33+" "+35+" "+37+" "+39); 
System.out.println(41+" "+43+" "+45+" "+47+" "+49+" "+51+" "+53+" "+55+" "+57+" "+59); 
System.out.println(61+" "+63+" "+65+" "+67+" "+69+" "+71+" "+73+" "+75+" "+77+" "+79); 
System.out.println(81+" "+83+" "+85+" "+87+" "+89+" "+91+" "+93+" "+95+" "+97+" "+99); 
} 
if(a==2) 
{ 
System.out.println(02+" "+03+" "+06+" "+07+" "+10+" "+11+" "+14+" "+15+" "+18+" "+19); 
System.out.println(22+" "+23+" "+26+" "+27+" "+30+" "+31+" "+34+" "+35+" "+38+" "+39); 
System.out.println(42+" "+43+" "+46+" "+47+" "+50+" "+51+" "+54+" "+55+" "+58+" "+59); 
System.out.println(62+" "+63+" "+66+" "+67+" "+70+" "+71+" "+74+" "+75+" "+78+" "+79); 
System.out.println(82+" "+83+" "+86+" "+87+" "+90+" "+91+" "+94+" "+95+" "+98+" "+99); 
} 
if(a==3) 
{ 
System.out.println(04+" "+05+" "+06+" "+07+" "+12+" "+13+" "+14+" "+15+" "+20+" "+21); 
System.out.println(22+" "+23+" "+28+" "+29+" "+30+" "+31+" "+36+" "+37+" "+38+" "+39); 
System.out.println(44+" "+45+" "+46+" "+47+" "+52+" "+53+" "+54+" "+55+" "+60+" "+61); 
System.out.println(62+" "+63+" "+68+" "+69+" "+70+" "+71+" "+76+" "+77+" "+78+" "+79); 
System.out.println(84+" "+85+" "+86+" "+87+" "+92+" "+93+" "+94+" "+95+" "+100); 
} 
if(a==4) 
{ 
System.out.println(8+" "+9+" "+10+" "+11+" "+12+" "+13+" "+14+" "+15+" "+24+" "+25); 
System.out.println(26+" "+27+" "+28+" "+29+" "+30+" "+31+" "+40+" "+41+" "+42+" "+43); 
System.out.println(44+" "+45+" "+46+" "+47+" "+56+" "+57+" "+58+" "+59+" "+60+" "+61); 
System.out.println(62+" "+63+" "+72+" "+73+" "+74+" "+75+" "+76+" "+77+" "+78+" "+79); 
System.out.println(88+" "+89+" "+90+" "+91+" "+92+" "+93+" "+94+" "+95); 
} 
if(a==5) 
{ 
System.out.println(16+" "+17+" "+18+" "+19+" "+20+" "+21+" "+22+" "+23+" "+24+" "+25); 
System.out.println(26+" "+27+" "+28+" "+29+" "+30+" "+31+" "+48+" "+49+" "+50+" "+51); 
System.out.println(52+" "+53+" "+54+" "+55+" "+56+" "+57+" "+58+" "+59+" "+60+" "+61); 
System.out.println(62+" "+63+" "+80+" "+81+" "+82+" "+83+" "+84+" "+85+" "+86+" "+87); 
System.out.println(88+" "+89+" "+90+" "+91+" "+92+" "+93+" "+94+" "+95); 
} 
if(a==6) 
{ 
System.out.println(32+" "+33+" "+34+" "+35+" "+36+" "+37+" "+38+" "+39+" "+40+" "+41); 
System.out.println(42+" "+43+" "+44+" "+45+" "+46+" "+47+" "+48+" "+49+" "+50+" "+51); 
System.out.println(52+" "+53+" "+54+" "+55+" "+56+" "+57+" "+58+" "+59+" "+60+" "+61); 
System.out.println(62+" "+63+" "+96+" "+97+" "+98+" "+99+" "+100); 
} 
if(a==7) 
{ 
System.out.println(64+" "+65+" "+66+" "+67+" "+68+" "+69+" "+70+" "+71+" "+72+" "+73); 
System.out.println(74+" "+75+" "+76+" "+77+" "+78+" "+79+" "+80+" "+81+" "+82+" "+83); 
System.out.println(84+" "+85+" "+86+" "+87+" "+88+" "+89+" "+90+" "+91+" "+92+" "+93); 
System.out.println(94+" "+95+" "+96+" "+97+" "+98+" "+99+" "+100); 
} 
} 
public static void main (String args[]) throws InterruptedException{ 
AdivinaNumero NU =new AdivinaNumero(); 
System.out.println("PROGRAMA QUE TE ADIVINARA UN NUMERO DEL 1 AL 1OO" ) ; 
System.out.println("PIENSA UN NUMERO" ) ; 
Thread.sleep(3000); 
System.out.println("\nAHORA SE TE PRESENTARAN VARIAS TABLAS" ) ; 
System.out.println("SI TU NUMERO SE ENCUENTRA EN DICHA TABLA\n" ) ; 
System.out.println("PULSA 1 SI ESTA" ); 
System.out.println("PULSA 2 SI NO ESTA" ); 
Thread.sleep(6000); 

int count = 0,maxtabla = 7;


int ntab=1,num=1,res=0,des=0; 
while(ntab<=maxtabla) 
{ 
NU.LIMPIA(); 
System.out.println(); 
System.out.println(); 
System.out.println(); 
Thread.sleep(1000); 
System.out.println(count+"/"+maxtabla+" Veces\n");
NU.tabla(ntab); 
System.out.println(); 
System.out.println(); 
System.out.println("SE ENCUENTRA TU NUMERO AQUI " ); 
System.out.println("1.- SI" ); 
System.out.println("2.- NO" ); 
des=Integer.parseInt(NU.leerDato()); 

count++;



if(des==1) 
{ 
res=res+num; 
} 
num=num*2; 
ntab=ntab+1; 
System.out.println(); 
System.out.println(); 
System.out.println(); 
} 
System.out.println("EL NUMERO QUE PENSASTE ERA:" ); 
System.out.println(res); 
} 
} 
