package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;


public class testt2 {
		public static void main(String[] args) {
			String a = "360 \n"+
"3M \n"+
"airdisk \n"+
"AKKO \n"+
"AOC \n"+
"ASV \n"+
"AUCS \n"+
"AZIO \n"+
"B.O.W \n"+
"banq \n"+
"BROADLINK \n"+
"BUBM \n"+
"CABLE CREATION \n"+
"Campo Marzio Design \n"+
"Canon \n"+
"CCB \n"+
"CE-LINK \n"+
"CHAINEDBOX \n"+
"CHERRY \n"+
"COMFAST \n"+
"COOL-FISH \n"+
"Cre8 \n"+
"DM \n"+
"dostyle \n"+
"Double A \n"+
"DUKE \n"+
"E.T \n"+
"EG \n"+
"eKL \n"+
"e代 \n"+
"e磊（e-elei） \n"+
"G.SKILL \n"+
"H3C \n"+
"HAILE \n"+
"HANASS \n"+
"HELLBOY \n"+
"HP \n"+
"iDiskk \n"+
"ifound \n"+
"ikbc \n"+
"iQunix \n"+
"isky \n"+
"IT-CEO \n"+
"JASUN \n"+
"JIB \n"+
"kinbor \n"+
"KODAK \n"+
"KONICA MINOLTA \n"+
"KYOCERA \n"+
"LaCie \n"+
"LD \n"+
"LEGRAND \n"+
"LG \n"+
"LyfieEye \n"+
"M&G \n"+
"MEMOBIRD \n"+
"Nakabayashi \n"+
"OKI \n"+
"ON \n"+
"OV \n"+
"Panasonic \n"+
"Pioneer \n"+
"PNY \n"+
"RDS \n"+
"RK \n"+
"SBARDA \n"+
"SHARP \n"+
"SKW \n"+
"TANGO \n"+
"TANOSEE \n"+
"TEXAS INSTRUMENTS \n"+
"ThinkPad \n"+
"Tombow \n"+
"TOTOLINK \n"+
"TOWE \n"+
"UBNT \n"+
"ULO \n"+
"uni \n"+
"V4INK \n"+
"Webetter \n"+
"Yottamaster \n"+
"ZINWELL \n"+
"阿米洛（Varmilo） \n"+
"埃普（UP） \n"+
"埃森客（Ithink） \n"+
"埃特（elite_value） \n"+
"艾比格特（iBIG Stor） \n"+
"艾利 \n"+
"艾泰（UTT） \n"+
"爱宝（Aibao） \n"+
"爱国者（aigo） \n"+
"爱快（iKuai） \n"+
"爱立识 \n"+
"爱普生（EPSON） \n"+
"安帝 \n"+
"安普康（AMPCOM） \n"+
"安普网联（AMP NETCONNECT） \n"+
"傲石 \n"+
"奥卡斯（AUCAS） \n"+
"奥尼（aoni） \n"+
"奥普 \n"+
"奥睿科（ORICO） \n"+
"奥速（ASHU） \n"+
"白雪（snowhite） \n"+
"百乐（PILOT） \n"+
"百事泰（BESTEK） \n"+
"百旺 \n"+
"班图 \n"+
"斑马牌（ZEBRA） \n"+
"包尔星克（PowerSync） \n"+
"宝克（BAOKE） \n"+
"暴享 \n"+
"北极熊（Polar bear） \n"+
"贝戋马户（james donkey） \n"+
"贝锐蒲公英 \n"+
"倍方 \n"+
"奔图（PANTUM） \n"+
"本手 \n"+
"比比牛 \n"+
"必联（B-LINK） \n"+
"毕加索（pimio） \n"+
"毕亚兹（BIAZE） \n"+
"飚王（SSK） \n"+
"缤乐美（papermate） \n"+
"冰豹 \n"+
"博格利诺BOGELINUO \n"+
"博扬（BOYANG） \n"+
"不得不爱 \n"+
"彩格 \n"+
"彩熙 \n"+
"沧田 \n"+
"晨光（M&G） \n"+
"晨鸣共好 \n"+
"晨鸣祥云 \n"+
"驰腾（chiteng） \n"+
"赤度 \n"+
"炽魂（Blasoul） \n"+
"川宇 \n"+
"传美 \n"+
"传誉（Chuanyu） \n"+
"创见（Transcend） \n"+
"创享 \n"+
"达而稳（DOREWIN） \n"+
"达尔优 \n"+
"达善 \n"+
"大黄蜂（BUMBLEBEE） \n"+
"大手印 \n"+
"大象键盘 \n"+
"戴尔（DELL） \n"+
"得力（deli） \n"+
"得印（befon） \n"+
"得韵（DERWENT） \n"+
"德力西 \n"+
"登峰 \n"+
"迪士尼（Disney） \n"+
"迪优美特（Diyomate） \n"+
"东芝（TOSHIBA） \n"+
"東格 \n"+
"多彩（Delux） \n"+
"梵想（FANXIANG） \n"+
"飞遁（LESAILES） \n"+
"飞利浦 \n"+
"飞利浦（PHILIPS） \n"+
"飞鱼星 \n"+
"飞兹（fizz） \n"+
"菲沐（FAMOR） \n"+
"菲森客（FTHINK） \n"+
"斐尔可 \n"+
"芬尚 \n"+
"富得快（FUDEKUAI） \n"+
"富德 \n"+
"富勒（Fuhlen） \n"+
"富士施乐（Fuji Xerox） \n"+
"富士通（Fujitsu） \n"+
"富士樱（FUSICA） \n"+
"盖世小鸡（GAMESIR） \n"+
"高品乐 \n"+
"格之格 \n"+
"弓箭手（Arcarius） \n"+
"公牛（BULL） \n"+
"广博（GuangBo） \n"+
"广颖电通（Silicon Power） \n"+
"国誉（KOKUYO） \n"+
"海锚 \n"+
"韩电（KEG） \n"+
"航嘉（Huntkey） \n"+
"黑甲虫 \n"+
"黑爵（AJAZZ） \n"+
"红环（rotring） \n"+
"宏碁（acer） \n"+
"鸿雁（HONYAR） \n"+
"华擎（ASRock） \n"+
"华三（H3C） \n"+
"华硕（ASUS） \n"+
"华为（HUAWEI） \n"+
"辉柏嘉（Faber-castell） \n"+
"汇东 \n"+
"绘儿乐（Crayola） \n"+
"绘威 \n"+
"惠爱家 \n"+
"惠尔金 \n"+
"惠朗（huilang） \n"+
"惠普（HP） \n"+
"火派（FIREFACTION） \n"+
"吉选（GESOBYTE） \n"+
"极路由 \n"+
"技嘉（GIGABYTE） \n"+
"佳能（Canon） \n"+
"佳印 \n"+
"建兴（LITEON） \n"+
"杰思特（JEAST） \n"+
"金晨鸣 \n"+
"金得利 \n"+
"金河田（Golden field） \n"+
"金隆兴 \n"+
"金旗舰（GOLD FLAGSHIP） \n"+
"金球（Gold Ball） \n"+
"金胜（kingshare） \n"+
"金士顿（Kingston） \n"+
"金万年（Genvana） \n"+
"京瓷（KYOCERA） \n"+
"京造 \n"+
"晶华 \n"+
"精臣 \n"+
"久好 \n"+
"聚风 \n"+
"卡文（KAWEN） \n"+
"卡西欧（CASIO） \n"+
"开博尔（Kaiboer） \n"+
"开玛（K-MARKING） \n"+
"开仰 \n"+
"凯萨（KAISA） \n"+
"康铂（COMNPRO） \n"+
"康亿（KONYEE） \n"+
"柯帅 \n"+
"科硕（KESU） \n"+
"酷冷至尊（CoolerMaster） \n"+
"莱盛 \n"+
"铼德（RITEK） \n"+
"兰科芯 \n"+
"蓝色妖姬（BLUELOVER） \n"+
"狼蛛（AULA） \n"+
"朗科（Netac） \n"+
"乐多（OHTO） \n"+
"雷柏（Rapoo） \n"+
"雷蛇（Razer） \n"+
"雷神（ThundeRobot） \n"+
"雷腾 \n"+
"雷霆世纪（Raytine） \n"+
"镭拓（Rantopad） \n"+
"磊科（netcore） \n"+
"礼嘉（LIJIA） \n"+
"理光（Ricoh） \n"+
"丽贴 \n"+
"连盛 \n"+
"联想 \n"+
"联想（Lenovo） \n"+
"联众（UME） \n"+
"良工（lengon） \n"+
"蔺科 \n"+
"灵蛇 \n"+
"灵逸 \n"+
"凌美（LAMY） \n"+
"领势（LINKSYS） \n"+
"六品堂 \n"+
"罗技（G） \n"+
"罗技（Logitech） \n"+
"洛斐（LOFREE） \n"+
"绿奥 \n"+
"绿巨能（llano） \n"+
"绿联（UGREEN） \n"+
"马可（MARCO） \n"+
"马培德（Maped） \n"+
"玛雅（MAYA） \n"+
"蚂蚁邦（Antbang） \n"+
"迈拓（Maxtor） \n"+
"麦克赛尔（Maxell） \n"+
"麦盘（bandisk） \n"+
"麦沃（MAIWO） \n"+
"猫太子（MAOTAIZI） \n"+
"美的（Midea） \n"+
"美商海盗船（USCORSAIR） \n"+
"咪鼠科技（Mimouse） \n"+
"谜石（MEGA STONE） \n"+
"米家（MIJIA） \n"+
"喵喵机 \n"+
"明基（BenQ） \n"+
"明瑞 \n"+
"铭大金碟（MNDA） \n"+
"摩豹（Motospeed） \n"+
"摩天手（Mofii） \n"+
"摩托罗拉（Motorola） \n"+
"魔蛋（magicforce） \n"+
"魔炼者（MAGIC-REFINER） \n"+
"耐泊尔（NAIPOER） \n"+
"耐力（NIKO） \n"+
"南国书香 \n"+
"倪可（neecoo） \n"+
"纽曼（Newmine） \n"+
"纽曼（Newsmy） \n"+
"纽赛（NUSIGN） \n"+
"欧标 \n"+
"派克（PARKER） \n"+
"派通（Pentel） \n"+
"盆景（bonsaii） \n"+
"品恒（PIHEN） \n"+
"普乐士 \n"+
"普联（TP-LINK） \n"+
"普霖 \n"+
"普贴（PUTY） \n"+
"齐心（COMIX） \n"+
"旗牌（Shachihata） \n"+
"前通（front） \n"+
"青米（CHING MI） \n"+
"清风 \n"+
"清风（kyfen） \n"+
"清华同方（THTF） \n"+
"秋叶原（CHOSEAL） \n"+
"权尚（Transshow） \n"+
"韧锋 \n"+
"锐意（Sharpie） \n"+
"睿阜（REVOFREE） \n"+
"睿因（Wavlink） \n"+
"睿者易通（WITEASY） \n"+
"赛德斯 \n"+
"赛睿（SteelSeries） \n"+
"赛亿（SAIYI） \n"+
"三堡（SMT） \n"+
"三木（SUNWOOD） \n"+
"三星（SAMSUNG） \n"+
"森松尼（sunsonny） \n"+
"山泽（SAMZHE） \n"+
"闪迪（SanDisk） \n"+
"绍泽文化（ShaoZe Culture） \n"+
"声缪斯（SONMUSE） \n"+
"胜为（shengwei） \n"+
"施德楼（STAEDTLER） \n"+
"施乐（XEROX） \n"+
"施耐德（Schneider） \n"+
"施耐德电气（Schneider Electric） \n"+
"首席玩家（1st player） \n"+
"树德（Shuter） \n"+
"双飞燕（A4TECH） \n"+
"双杰 \n"+
"水星（MERCURY） \n"+
"舜普（SP） \n"+
"硕方 \n"+
"思科（CISCO） \n"+
"思印 \n"+
"斯图（sitoo） \n"+
"松下（Panasonic） \n"+
"索尼（SONY） \n"+
"台电（TECLAST） \n"+
"钛度（Taidu） \n"+
"探戈 \n"+
"探戈（TANGO） \n"+
"腾达（Tenda） \n"+
"天色（TIANSE） \n"+
"天威（PrintRite） \n"+
"天文（TEN-WIN） \n"+
"天之（Tianzhi） \n"+
"铁修罗（TESORO） \n"+
"突破（TOP） \n"+
"外星人（Alienware） \n"+
"网件（NETGEAR） \n"+
"网易 \n"+
"威刚（ADATA） \n"+
"威迅（VENTION） \n"+
"微软（Microsoft） \n"+
"微星（MSI） \n"+
"伟文（wewin） \n"+
"未来世界 \n"+
"文谷（Wengu） \n"+
"武京生 \n"+
"西部数据（WD） \n"+
"西玛 \n"+
"西玛（SIMAA） \n"+
"希捷（SEAGATE） \n"+
"犀飞利（sheaffer） \n"+
"现代（HYUNDAI） \n"+
"小米（MI） \n"+
"欣乐（UPM Copykid） \n"+
"新北洋（SNBC） \n"+
"新贵（Newmen） \n"+
"新好 \n"+
"新绿天章 \n"+
"新盟（Technology） \n"+
"信发（TRNFA） \n"+
"星极（XANOVA） \n"+
"星遥博（Cinyobo） \n"+
"兄弟（brother） \n"+
"讯拓（Sunt） \n"+
"迅捷（FAST） \n"+
"雅文（Aria） \n"+
"一吉贝 \n"+
"宜客莱（ECOLA） \n"+
"宜适酷（EXCO） \n"+
"忆捷（EAGET） \n"+
"益而高（EaGLE） \n"+
"翼蛇（yishe） \n"+
"英菲克（INPHIC） \n"+
"英特曼（Etman） \n"+
"英雄（HERO） \n"+
"樱花（SAKURA） \n"+
"影级（iNSIST） \n"+
"映美（Jolimark） \n"+
"映美佳 \n"+
"用友表单 \n"+
"优蝶（YOUDIE） \n"+
"优和（UHOO） \n"+
"优派（ViewSonic） \n"+
"优想 \n"+
"优越者 \n"+
"游戏狂人（GAME MADMAN） \n"+
"友讯（D-Link） \n"+
"语鼠 \n"+
"战翼 \n"+
"长城风行 \n"+
"真彩（TRUECOLOR） \n"+
"正彩 \n"+
"指思（Jesis） \n"+
"至尚·创美（SCM） \n"+
"卓越佳印 \n"+
"啄木鸟 \n"+
"子弹头 \n"+
"紫光（UNIS）";
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
		write("C:\\picss\\This.txt",collect);
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
