package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class testt {
		public static void main(String[] args) {
			String a="鸿雁（HONYAR）\n" + 
					"花生棒\n" + 
					"NEC\n" + 
					"影级（iNSIST）\n" + 
					"英特尔（Intel）\n" + 
					"傲石\n" + 
					"川宇\n" + 
					"微星（MSI）\n" + 
					"HSO\n" + 
					"kinbor\n" + 
					"思印\n" + 
					"钛度（Taidu）\n" + 
					"北极熊（Polar bear）\n" + 
					"缤特力（Plantronics）\n" + 
					"魔蛋（magicforce）\n" + 
					"iQunix\n" + 
					"游戏狂人（GAME MADMAN）\n" + 
					"天气不错（Good Weather）\n" + 
					"noctua\n" + 
					"映泰\n" + 
					"玛雅（MAYA）\n" + 
					"贝戋马户（james donkey）\n" + 
					"新绿天章\n" + 
					"坚果（JmGO）\n" + 
					"沧田\n" + 
					"斐尔可\n" + 
					"铭瑄（MAXSUN）\n" + 
					"耕升（GAINWARD）\n" + 
					"铁威马（TERRA MASTER）\n" + 
					"耐泊尔（NAIPOER）\n" + 
					"Crucial\n" + 
					"海尔（Haier）\n" + 
					"威联通（QNAP）\n" + 
					"岡祈（Gangqi）\n" + 
					"HKC\n" + 
					"诺西（NUOXI）\n" + 
					"技讯（GVNXUHI）\n" + 
					"浦科特（PLEXTOR）\n" + 
					"中兴（ZTE）\n" + 
					"惠尔金\n" + 
					"banq\n" + 
					"康艺（KANGYI）\n" + 
					"豪艺（HOOYE）\n" + 
					"冰豹\n" + 
					"艾洛维（inovel）\n" + 
					"晶华\n" + 
					"联想（ThinkCentre）\n" + 
					"好会通（Meeteasy）\n" + 
					"GBC\n" + 
					"麦沃（MAIWO）\n" + 
					"用友表单\n" + 
					"酷睿冰尊（ICE COOREL）\n" + 
					"大镰刀（SCYTHE）\n" + 
					"雷神（ThundeRobot）\n" + 
					"创享\n" + 
					"普乐士\n" + 
					"游戏悍将\n" + 
					"优铂（UPlatinum）\n" + 
					"辉柏嘉（Faber-castell）\n" + 
					"捷波朗（Jabra）\n" + 
					"金百达\n" + 
					"绿奥\n" + 
					"柯达（Kodak）\n" + 
					"绘儿乐（Crayola）\n" + 
					"雷霆世纪（Raytine）\n" + 
					"蚂蚁邦（Antbang）\n" + 
					"容大\n" + 
					"ikbc\n" + 
					"NCL\n" + 
					"PICKIT\n" + 
					"EVGA\n" + 
					"品胜（PISEN）\n" + 
					"索泰（ZOTAC）\n" + 
					"Brateck\n" + 
					"杰科（GIEC）\n" + 
					"AKKO\n" + 
					"Nakabayashi\n" + 
					"影驰\n" + 
					"光威（Gloway）\n" + 
					"施耐德（Schneider）\n" + 
					"UBNT\n" + 
					"埃森客（Ithink）\n" + 
					"倍方\n" + 
					"霍尼韦尔（Honeywell）\n" + 
					"博扬（BOYANG）\n" + 
					"全何（Color Your Life V-Color）\n" + 
					"翼蛇（yishe）\n" + 
					"优想\n" + 
					"韩电（KEG）\n" + 
					"品恒（PIHEN）\n" + 
					"惠爱家\n" + 
					"映众（Inno3D）\n" + 
					"谜石（MEGA STONE）\n" + 
					"N次贴（STICKN）\n" + 
					"微鲸\n" + 
					"神舟（HASEE）\n" + 
					"极路由\n" + 
					"连盛\n" + 
					"电视果\n" + 
					"中柏（Jumper）\n" + 
					"本手\n" + 
					"菲森客（FTHINK）\n" + 
					"灵蛇\n" + 
					"睿阜（REVOFREE）\n" + 
					"AM\n" + 
					"魅族（MEIZU）\n" + 
					"极客人（GEEKPEOPLE）\n" + 
					"吉选（GESOBYTE）\n" + 
					"康颂（CANSON）\n" + 
					"飞兹（fizz）\n" + 
					"卡拉羊（Carany）\n" + 
					"安普康（AMPCOM）\n" + 
					"快朵小屋（KUAIDUOXIAOWU）\n" + 
					"盈通（yeston）\n" + 
					"黑甲虫\n" + 
					"映美佳\n" + 
					"DATANG\n" + 
					"PEO\n" + 
					"米家（MIJIA）\n" + 
					"天之（Tianzhi）\n" + 
					"神舟战神\n" + 
					"RDS\n" + 
					"夏普（Sharp）\n" + 
					"iDiskk\n" + 
					"外星人（Alienware）\n" + 
					"联想（ThinkStation）\n" + 
					"机械革命（MECHREVO）\n" + 
					"高漫\n" + 
					"绘王（HUION）\n" + 
					"摩托罗拉（Motorola）\n" + 
					"悟印像\n" + 
					"Yottamaster\n" + 
					"富德\n" + 
					"COOL-FISH\n" + 
					"Fractal Design\n" + 
					"神画（PIQS）\n" + 
					"魔炼者（MAGIC-REFINER）\n" + 
					"大象键盘\n" + 
					"KONICA MINOLTA\n" + 
					"迪兰（Dataland）\n" + 
					"九猫（JiuMao）\n" + 
					"施耐德电气（Schneider Electric）\n" + 
					"CZUR\n" + 
					"节奏坦克（TempoTec）\n" + 
					"杉木林\n" + 
					"Fellowes\n" + 
					"丽台（LEADTEK）\n" + 
					"ThinkPlus\n" + 
					"正彩\n" + 
					"菲沐（FAMOR）\n" + 
					"清华同方（THTF）\n" + 
					"阿斯加特（Asgard）\n" + 
					"青米（CHING MI）\n" + 
					"新科（Shinco）\n" + 
					"TCL\n" + 
					"理光（Ricoh）\n" + 
					"优蝶（YOUDIE）\n" + 
					"乐视\n" + 
					"迅雷\n" + 
					"礼嘉（LIJIA）\n" + 
					"VAIO\n" + 
					"JASUN\n" + 
					"逊镭（NTEUMM）\n" + 
					"得实（Dascom）\n" + 
					"长城风行\n" + 
					"大麦\n" + 
					"玩家国度（REPUBLIC OF GAMERS）\n" + 
					"七喜（HEDY）\n" + 
					"卓越佳印\n" + 
					"佳印\n" + 
					"BOCT\n" + 
					"海信（Hisense）\n" + 
					"PHOTOBEE\n" + 
					"未来人类（Terrans Force）\n" + 
					"HP\n" + 
					"贝锐蒲公英\n" + 
					"MEMOBIRD\n" + 
					"富士樱（FUSICA）\n" + 
					"树德（Shuter）\n" + 
					"易视讯（YSX）\n" + 
					"爱格升（ERGOTRON）\n" + 
					"小乙（Ant Black）\n" + 
					"斯图（sitoo）\n" + 
					"宁美国度\n" + 
					"精臣\n" + 
					"KYOCERA\n" + 
					"战旗\n" + 
					"京天（KOTIN）\n" + 
					"DUKE\n" + 
					"韧锋\n" + 
					"小帅\n" + 
					"爱立顺（aoson）\n" + 
					"恩兔（N2）\n" + 
					"JIB\n" + 
					"紫图\n" + 
					"BOE\n" + 
					"喵喵机\n" + 
					"迦观\n" + 
					"康佳（KONKA）\n" + 
					"東格\n" + 
					"新大陆（Newland）\n" + 
					"isky\n" + 
					"Snowkids\n" + 
					"攀升（IPASON）\n" + 
					"声缪斯（SONMUSE）\n" + 
					"蓝宝石（Sapphire）\n" + 
					"西玛\n" + 
					"海兰\n" + 
					"CABLE CREATION\n" + 
					"网易\n" + 
					"缤乐美（papermate）\n" + 
					"格志（Grozziie）\n" + 
					"子弹头\n" + 
					"海锚\n" + 
					"商米（sunmi）\n" + 
					"加普威（JIAPUWEI）\n" + 
					"名龙堂（MLOONG）\n" + 
					"SKW\n" + 
					"一吉贝\n" + 
					"玩客云\n" + 
					"eKL\n" + 
					"酷耶（Cooyes）\n" + 
					"凌美（LAMY）\n" + 
					"腾讯（Tencent）\n" + 
					"ESALEB\n" + 
					"咪鼠科技（Mimouse）\n" + 
					"ON\n" + 
					"华视电子\n" + 
					"乐多（OHTO）\n" + 
					"伟文（wewin）\n" + 
					"雅文（Aria）\n" + 
					"传誉（Chuanyu）\n" + 
					"iFUNK\n" + 
					"明瑞\n" + 
					"天色（TIANSE）\n" + 
					"斑马牌（ZEBRA）\n" + 
					"冠微（GOVO）\n" + 
					"卡尔\n" + 
					"晨鸣祥云\n" + 
					"金晨鸣\n" + 
					"晨鸣共好\n" + 
					"马利（Marie's）\n" + 
					"达而稳（DOREWIN）\n" + 
					"星遥博（Cinyobo）\n" + 
					"联想（ThinkServer）\n" + 
					"吉米家居\n" + 
					"康铂（COMNPRO）\n" + 
					"明加（MINGMORE）\n" + 
					"huawei\n" + 
					"富士（FUJIFILM）\n" + 
					"大黄蜂（BUMBLEBEE）\n" + 
					"聚风\n" + 
					"狄派\n" + 
					"艾比格特（iBIG Stor）\n" + 
					"remax\n" + 
					"暴风\n" + 
					"现代e派\n" + 
					"Porsche Design\n" + 
					"基士得耶（GESTETNER）\n" + 
					"新盟（Technology）\n" + 
					"M&G\n" + 
					"ELFINBOOK\n" + 
					"然鹏\n" + 
					"利盟（Lexmark）\n" + 
					"锐意（Sharpie）\n" + 
					"炽魂（Blasoul）\n" + 
					"召唤师\n" + 
					"彩格\n" + 
					"米家\n" + 
					"艺卓\n" + 
					"申士（SHEN SHI）\n" + 
					"欧标\n" + 
					"IE-LINK\n" + 
					"Boogie Board\n" + 
					"战翼\n" + 
					"迈拓（Maxtor）\n" + 
					"TAILi\n" + 
					"趁早\n" + 
					"极限矩阵\n" + 
					"畅想视界（ThinkView）\n" + 
					"美商（meetsun）\n" + 
					"Campo Marzio Design\n" + 
					"富得快（FUDEKUAI）\n" + 
					"AZIO\n" + 
					"飞遁（LESAILES）\n" + 
					"宏燕\n" + 
					"卓鹿（ZHUOLU）\n" + 
					"大手印\n" + 
					"至尚·创美（SCM）\n" + 
					"HONXIN\n" + 
					"V4INK\n" + 
					"新中新\n" + 
					"理想（RISO）\n" + 
					"柔宇（ROYOLE）\n" + 
					"礼嘉\n" + 
					"通信汪（CommKing）\n" + 
					"红环（rotring）\n" + 
					"铁修罗（TESORO）\n" + 
					"英菲克（INPHIC）\n" + 
					"贝尔金（BELKIN）\n" + 
					"奥卡斯（AUCAS）\n" + 
					"语鼠\n" + 
					"金万年（Genvana）\n" + 
					"彩熙\n" + 
					"Elean\n" + 
					"雷腾\n" + 
					"众叶（SOONye）\n" + 
					"优玛仕（U-MACH）\n" + 
					"音络（INNOTRIK）\n" + 
					"V’mo\n" + 
					"柯帅\n" + 
					"蔺科\n" + 
					"清风\n" + 
					"赤度\n" + 
					"互视达（HUSHIDA）\n" + 
					"正睿（ZRPGS）\n" + 
					"天敏（10moons）\n" + 
					"润普（Runpu）\n" + 
					"现代笔\n" + 
					"南国书香\n" + 
					"TANOSEE\n" + 
					"猫太子（MAOTAIZI）\n" + 
					"凯蒂卡乐（KIDDYCOLOR）\n" + 
					"得韵（DERWENT）\n" + 
					"益而高（EaGLE）\n" + 
					"前通（front）\n" + 
					"Thermalright\n" + 
					"圣旗\n" + 
					"普贴（PUTY）\n" + 
					"NEBULA\n" + 
					"大千纸业\n" + 
					"汉能（Hanergy）\n" + 
					"HELLBOY\n" + 
					"MICROTEK\n" + 
					"英明仕（intimus）\n" + 
					"爱快（iKuai）\n" + 
					"征途\n" + 
					"兰科芯\n" + 
					"蒙玛特（Mont Marte）\n" + 
					"纽赛（NUSIGN）\n" + 
					"Tombow\n" + 
					"LyfieEye\n" + 
					"星灵\n" + 
					"歌派（GEPAD）\n" + 
					"京造\n" + 
					"NVIDIA\n" + 
					"Prolimatech\n" + 
					"CCB\n" + 
					"szllwl\n" + 
					"爱立识\n" + 
					"海康威视（HIKVISION）\n" + 
					"LEGRAND\n" + 
					"犀飞利（sheaffer）\n" + 
					"班图\n" + 
					"双杰\n" + 
					"嘉仕美（Jesm）\n" + 
					"开仰\n" + 
					"灵逸\n" + 
					"新北洋（SNBC）\n" + 
					"testo\n" + 
					"美团点评\n" + 
					"联众（UME）\n" + 
					"梵想（FANXIANG）\n" + 
					"alhua\n" + 
					"ASV\n" + 
					"茶花（CHAHUA）\n" + 
					"ATEN\n" + 
					"Sandy AIR\n" + 
					"指思（Jesis）\n" + 
					"科赋（KLEVV）\n" + 
					"BUBM\n" + 
					"杰思特（JEAST）\n" + 
					"友基（UGEE）\n" + 
					"麦盘（bandisk）\n" + 
					"超微（SUPERMICRO）\n" + 
					"百事泰（BESTEK）\n" + 
					"东亚（DONG-A）\n" + 
					"派通（Pentel）\n" + 
					"凯兰帝（CARAN  d'ACHE）\n" + 
					"善领\n" + 
					"GlocalMe\n" + 
					"LIANLI\n" + 
					"洛斐（LOFREE）\n" + 
					"森松尼（sunsonny）\n" + 
					"果田\n" + 
					"京选\n" + 
					"武京生\n" + 
					"天文（TEN-WIN）\n" + 
					"蓝色妖姬（BLUELOVER）\n" + 
					"炫龙\n" + 
					"努比亚（nubia）\n" + 
					"舜普（SP）\n" + 
					"JRC\n" + 
					"onebot\n" + 
					"硕方\n" + 
					"WinFast\n" + 
					"六品堂\n" + 
					"airdisk\n" + 
					"RAISE\n" + 
					"ISKN Slate\n" + 
					"麦联宝\n" + 
					"EG\n" + 
					"长虹\n" + 
					"Cre8\n" + 
					"大唐鼎志\n" + 
					"艾科朗（iClub）\n" + 
					"鸿合（HiteVision）\n" + 
					"未来世界\n" + 
					"金旗舰（GOLD FLAGSHIP）\n" + 
					"新好\n" + 
					"开玛（K-MARKING）\n" + 
					"合金水冷（ALLOYMODERNIST）\n" + 
					"秀普（Superior）\n" + 
					"科硕（KESU）\n" + 
					"越来越酷（COOLCOLD）\n" + 
					"盖世小鸡（GAMESIR）\n" + 
					"Rigal\n" + 
					"本腾\n" + 
					"雾海（WIWAV）\n" + 
					"爱奇艺\n" + 
					"轰天砲（Poner Saund）\n" + 
					"LD\n" + 
					"旗牌（Shachihata）\n" + 
					"赛亿（SAIYI）\n" + 
					"H3C\n" + 
					"意锐（inSPIRY）\n" + 
					"百视通（BesTV）\n" + 
					"火派（FIREFACTION）\n" + 
					"Pioneer\n" + 
					"广颖电通（Silicon Power）\n" + 
					"野花\n" + 
					"宣青\n" + 
					"HANASS\n" + 
					"万播\n" + 
					"APPOTRONICS\n" + 
					"博格利诺BOGELINUO\n" + 
					"不得不爱\n" + 
					"飞利浦\n" + 
					"凯伦猫（KALRENCAT）\n" + 
					"Bitspower\n" + 
					"CALLTEL\n" + 
					"德力西\n" + 
					"悦木（Joytop）\n" + 
					"MOLESKINE\n" + 
					"秦始皇\n" + 
					"安帝\n" + 
					"skycolor\n" + 
					"L-mix\n" + 
					"顶尖\n" + 
					"倪可（neecoo）\n" + 
					"NVV\n" + 
					"乔安（JOOAN）\n" + 
					"文谷（Wengu）\n" + 
					"ULO\n" + 
					"be quiet\n" + 
					"CHAINEDBOX\n" + 
					"菲伯尔（FIBBR）\n" + 
					"驰腾（chiteng）\n" + 
					"驰腾\n" + 
					"SBARDA\n" + 
					"贝碧欧（Pebeo）\n" + 
					"京瓷（KYOCERA）\n" + 
					"屁颠虫（Hifier）\n" + 
					"maxhub\n" + 
					"BARROWCH\n" + 
					"丽贴\n" + 
					"艾利\n" + 
					"炽果（ ZEAGINAL）\n" + 
					"支尔成\n" + 
					"艾湃电竞（Apexgaming）\n" + 
					"金为\n" + 
					"阿尔法酷（ALPHACOOL）\n" + 
					"索诺克（Sonnoc）\n" + 
					"星极（XANOVA）\n" + 
					"京东\n" + 
					"阿米洛（Varmilo）\n" + 
					"大眼橙\n" + 
					"AIX\n" + 
					"" + 
			""	;
			String collect = Arrays.stream(a.split("\n")).map(x->"<Brand>\n" + 
						"        <ProductUpdate>true</ProductUpdate>\n" + 
						"        <IsPriceUpdate>true</IsPriceUpdate>\n" + 
						"        <IsCategorieUpdate>true</IsCategorieUpdate>\n" + 
						"        <IsAgent>true</IsAgent>\n" + 
						"        <CobName>"+x+"</CobName>\n" + 
						"        <FactoryName>"+x+"</FactoryName>        \n" + 
						"        <IsSaleDanger>true</IsSaleDanger>\n" + 
						"        <UrlIsValid>true</UrlIsValid>\n" + 
						"        <Discount>1</Discount>\n" + 
						"</Brand> ").collect(Collectors.joining());
			write("C:\\picss\\Agent.txt",collect);
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
			
		System.out.println("Agent文件已经生成.....");
		}
	
}
