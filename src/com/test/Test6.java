package com.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test6 {
	public static void main(String[] args) {
		String a="马利（Marie's）,达而稳（DOREWIN）,星遥博（Cinyobo）,联想（ThinkServer）,康铂（COMNPRO）,明加（MINGMORE）,富士（FUJIFILM）,大黄蜂（BUMBLEBEE）,艾比格特（iBIG Stor）,基士得耶（GESTETNER）,新盟（Technology）,利盟（Lexmark）,锐意（Sharpie）,炽魂（Blasoul）,申士（SHEN SHI）,迈拓（Maxtor）,畅想视界（ThinkView）,美商（meetsun）,富得快（FUDEKUAI）,飞遁（LESAILES）,卓鹿（ZHUOLU）,至尚·创美（SCM）,理想（RISO）,柔宇（ROYOLE）,通信汪（CommKing）,红环（rotring）,铁修罗（TESORO）,英菲克（INPHIC）,贝尔金（BELKIN）,奥卡斯（AUCAS）,金万年（Genvana）,众叶（SOONye）,优玛仕（U-MACH）,音络（INNOTRIK）,V’mo,互视达（HUSHIDA）,正睿（ZRPGS）,天敏（10moons）,润普（Runpu）,猫太子（MAOTAIZI）,凯蒂卡乐（KIDDYCOLOR）,得韵（DERWENT）,益而高（EaGLE）,前通（front）,普贴（PUTY）,NEBULA,大千纸业,汉能（Hanergy）,英明仕（intimus）,爱快（iKuai）,蒙玛特（Mont Marte）,纽赛（NUSIGN）,Tombow,LyfieEye,星灵,歌派（GEPAD）,海康威视（HIKVISION）,LEGRAND,犀飞利（sheaffer）,嘉仕美（Jesm）,新北洋（SNBC）,联众（UME）,梵想（FANXIANG）,茶花（CHAHUA）,指思（Jesis）,科赋（KLEVV）,BUBM,杰思特（JEAST）,友基（UGEE）,麦盘（bandisk）,超微（SUPERMICRO）,百事泰（BESTEK）,东亚（DONG-A）,派通（Pentel）,凯兰帝（CARAN  d'ACHE）";
		String[] split = a.split(",");
		StringBuffer sss = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
				sss.append((split[i]).split("（")[0]+",");
		}
	write("C:\\picss\\ccc.txt",sss.toString());
	}
	public static void write(String fileName, String content) {
	        FileWriter writer = null;
	        try {
	            writer = new FileWriter(fileName, false); 
	            writer.write(content);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(writer != null){
	                    writer.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		
	System.out.println("~文件已经生成.....");
	}
}
