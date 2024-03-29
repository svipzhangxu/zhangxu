package nc.vo.riaam.privileges;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加累的描述信息
 * </p>
 *  创建日期:2019-7-30
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class Dateprivileges_zx extends SuperVO {
	
/**
*物料权限主键
*/
public String pk_privileges;
/**
*用户
*/
public String cuserid;
/**
*集团
*/
public String pk_group;
/**
*所属组织
*/
public String pk_org;
/**
*所属组织最新版本
*/
public String pk_org_v;
/**
*制单人
*/
public String billmaker;
/**
*制单日期
*/
public UFDate dmakedate;
/**
*创建人
*/
public String creator;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*最后修改人
*/
public String modifier;
/**
*最后修改时间
*/
public UFDateTime modifiedtime;
/**
*审批人
*/
public String approver;
/**
*审批时间
*/
public UFDateTime taudittime;
/**
*单据状态
*/
public int fstatusflag;
/**
*审批评语
*/
public String approvenote;
/**
*自定义项0
*/
public String vdef0;
/**
*自定义项19
*/
public String vdef19;
/**
*自定义项18
*/
public String vdef18;
/**
*自定义项17
*/
public String vdef17;
/**
*自定义项16
*/
public String vdef16;
/**
*自定义项15
*/
public String vdef15;
/**
*自定义项14
*/
public String vdef14;
/**
*自定义项13
*/
public String vdef13;
/**
*自定义项12
*/
public String vdef12;
/**
*自定义项11
*/
public String vdef11;
/**
*自定义项10
*/
public String vdef10;
/**
*自定义项9
*/
public String vdef9;
/**
*自定义项8
*/
public String vdef8;
/**
*自定义项7
*/
public String vdef7;
/**
*自定义项6
*/
public String vdef6;
/**
*自定义项20
*/
public String vdef20;
/**
*自定义项5
*/
public String vdef5;
/**
*自定义项4
*/
public String vdef4;
/**
*自定义项3
*/
public String vdef3;
/**
*自定义项2
*/
public String vdef2;
/**
*自定义项1
*/
public String vdef1;
/**
*时间戳
*/
public UFDateTime ts;
    
    
/**
* 属性 pk_privileges的Getter方法.属性名：物料权限主键
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getPk_privileges() {
return this.pk_privileges;
} 

/**
* 属性pk_privileges的Setter方法.属性名：物料权限主键
* 创建日期:2019-7-30
* @param newPk_privileges java.lang.String
*/
public void setPk_privileges ( String pk_privileges) {
this.pk_privileges=pk_privileges;
} 
 
/**
* 属性 cuserid的Getter方法.属性名：用户
*  创建日期:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getCuserid() {
return this.cuserid;
} 

/**
* 属性cuserid的Setter方法.属性名：用户
* 创建日期:2019-7-30
* @param newCuserid nc.vo.sm.UserVO
*/
public void setCuserid ( String cuserid) {
this.cuserid=cuserid;
} 
 
/**
* 属性 pk_group的Getter方法.属性名：集团
*  创建日期:2019-7-30
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* 属性pk_group的Setter方法.属性名：集团
* 创建日期:2019-7-30
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* 属性 pk_org的Getter方法.属性名：所属组织
*  创建日期:2019-7-30
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* 属性pk_org的Setter方法.属性名：所属组织
* 创建日期:2019-7-30
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* 属性 pk_org_v的Getter方法.属性名：所属组织最新版本
*  创建日期:2019-7-30
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* 属性pk_org_v的Setter方法.属性名：所属组织最新版本
* 创建日期:2019-7-30
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* 属性 billmaker的Getter方法.属性名：制单人
*  创建日期:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getBillmaker() {
return this.billmaker;
} 

/**
* 属性billmaker的Setter方法.属性名：制单人
* 创建日期:2019-7-30
* @param newBillmaker nc.vo.sm.UserVO
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* 属性 dmakedate的Getter方法.属性名：制单日期
*  创建日期:2019-7-30
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDmakedate() {
return this.dmakedate;
} 

/**
* 属性dmakedate的Setter方法.属性名：制单日期
* 创建日期:2019-7-30
* @param newDmakedate nc.vo.pub.lang.UFDate
*/
public void setDmakedate ( UFDate dmakedate) {
this.dmakedate=dmakedate;
} 
 
/**
* 属性 creator的Getter方法.属性名：创建人
*  创建日期:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* 属性creator的Setter方法.属性名：创建人
* 创建日期:2019-7-30
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* 属性 creationtime的Getter方法.属性名：创建时间
*  创建日期:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* 属性creationtime的Setter方法.属性名：创建时间
* 创建日期:2019-7-30
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* 属性 modifier的Getter方法.属性名：最后修改人
*  创建日期:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* 属性modifier的Setter方法.属性名：最后修改人
* 创建日期:2019-7-30
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* 属性 modifiedtime的Getter方法.属性名：最后修改时间
*  创建日期:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* 属性modifiedtime的Setter方法.属性名：最后修改时间
* 创建日期:2019-7-30
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* 属性 approver的Getter方法.属性名：审批人
*  创建日期:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getApprover() {
return this.approver;
} 

/**
* 属性approver的Setter方法.属性名：审批人
* 创建日期:2019-7-30
* @param newApprover nc.vo.sm.UserVO
*/
public void setApprover ( String approver) {
this.approver=approver;
} 
 
/**
* 属性 taudittime的Getter方法.属性名：审批时间
*  创建日期:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTaudittime() {
return this.taudittime;
} 

/**
* 属性taudittime的Setter方法.属性名：审批时间
* 创建日期:2019-7-30
* @param newTaudittime nc.vo.pub.lang.UFDateTime
*/
public void setTaudittime ( UFDateTime taudittime) {
this.taudittime=taudittime;
} 
 
/**
* 属性 fstatusflag的Getter方法.属性名：单据状态
*  创建日期:2019-7-30
* @return nc.vo.so.pub.enumeration.BillStatus
*/
public int getFstatusflag() {
return this.fstatusflag;
} 

/**
* 属性fstatusflag的Setter方法.属性名：单据状态
* 创建日期:2019-7-30
* @param newFstatusflag nc.vo.so.pub.enumeration.BillStatus
*/
public void setFstatusflag ( int fstatusflag) {
this.fstatusflag=fstatusflag;
} 
 
/**
* 属性 approvenote的Getter方法.属性名：审批评语
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getApprovenote() {
return this.approvenote;
} 

/**
* 属性approvenote的Setter方法.属性名：审批评语
* 创建日期:2019-7-30
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* 属性 vdef0的Getter方法.属性名：自定义项0
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef0() {
return this.vdef0;
} 

/**
* 属性vdef0的Setter方法.属性名：自定义项0
* 创建日期:2019-7-30
* @param newVdef0 java.lang.String
*/
public void setVdef0 ( String vdef0) {
this.vdef0=vdef0;
} 
 
/**
* 属性 vdef19的Getter方法.属性名：自定义项19
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef19() {
return this.vdef19;
} 

/**
* 属性vdef19的Setter方法.属性名：自定义项19
* 创建日期:2019-7-30
* @param newVdef19 java.lang.String
*/
public void setVdef19 ( String vdef19) {
this.vdef19=vdef19;
} 
 
/**
* 属性 vdef18的Getter方法.属性名：自定义项18
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef18() {
return this.vdef18;
} 

/**
* 属性vdef18的Setter方法.属性名：自定义项18
* 创建日期:2019-7-30
* @param newVdef18 java.lang.String
*/
public void setVdef18 ( String vdef18) {
this.vdef18=vdef18;
} 
 
/**
* 属性 vdef17的Getter方法.属性名：自定义项17
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef17() {
return this.vdef17;
} 

/**
* 属性vdef17的Setter方法.属性名：自定义项17
* 创建日期:2019-7-30
* @param newVdef17 java.lang.String
*/
public void setVdef17 ( String vdef17) {
this.vdef17=vdef17;
} 
 
/**
* 属性 vdef16的Getter方法.属性名：自定义项16
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef16() {
return this.vdef16;
} 

/**
* 属性vdef16的Setter方法.属性名：自定义项16
* 创建日期:2019-7-30
* @param newVdef16 java.lang.String
*/
public void setVdef16 ( String vdef16) {
this.vdef16=vdef16;
} 
 
/**
* 属性 vdef15的Getter方法.属性名：自定义项15
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef15() {
return this.vdef15;
} 

/**
* 属性vdef15的Setter方法.属性名：自定义项15
* 创建日期:2019-7-30
* @param newVdef15 java.lang.String
*/
public void setVdef15 ( String vdef15) {
this.vdef15=vdef15;
} 
 
/**
* 属性 vdef14的Getter方法.属性名：自定义项14
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef14() {
return this.vdef14;
} 

/**
* 属性vdef14的Setter方法.属性名：自定义项14
* 创建日期:2019-7-30
* @param newVdef14 java.lang.String
*/
public void setVdef14 ( String vdef14) {
this.vdef14=vdef14;
} 
 
/**
* 属性 vdef13的Getter方法.属性名：自定义项13
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef13() {
return this.vdef13;
} 

/**
* 属性vdef13的Setter方法.属性名：自定义项13
* 创建日期:2019-7-30
* @param newVdef13 java.lang.String
*/
public void setVdef13 ( String vdef13) {
this.vdef13=vdef13;
} 
 
/**
* 属性 vdef12的Getter方法.属性名：自定义项12
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef12() {
return this.vdef12;
} 

/**
* 属性vdef12的Setter方法.属性名：自定义项12
* 创建日期:2019-7-30
* @param newVdef12 java.lang.String
*/
public void setVdef12 ( String vdef12) {
this.vdef12=vdef12;
} 
 
/**
* 属性 vdef11的Getter方法.属性名：自定义项11
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef11() {
return this.vdef11;
} 

/**
* 属性vdef11的Setter方法.属性名：自定义项11
* 创建日期:2019-7-30
* @param newVdef11 java.lang.String
*/
public void setVdef11 ( String vdef11) {
this.vdef11=vdef11;
} 
 
/**
* 属性 vdef10的Getter方法.属性名：自定义项10
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef10() {
return this.vdef10;
} 

/**
* 属性vdef10的Setter方法.属性名：自定义项10
* 创建日期:2019-7-30
* @param newVdef10 java.lang.String
*/
public void setVdef10 ( String vdef10) {
this.vdef10=vdef10;
} 
 
/**
* 属性 vdef9的Getter方法.属性名：自定义项9
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef9() {
return this.vdef9;
} 

/**
* 属性vdef9的Setter方法.属性名：自定义项9
* 创建日期:2019-7-30
* @param newVdef9 java.lang.String
*/
public void setVdef9 ( String vdef9) {
this.vdef9=vdef9;
} 
 
/**
* 属性 vdef8的Getter方法.属性名：自定义项8
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef8() {
return this.vdef8;
} 

/**
* 属性vdef8的Setter方法.属性名：自定义项8
* 创建日期:2019-7-30
* @param newVdef8 java.lang.String
*/
public void setVdef8 ( String vdef8) {
this.vdef8=vdef8;
} 
 
/**
* 属性 vdef7的Getter方法.属性名：自定义项7
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef7() {
return this.vdef7;
} 

/**
* 属性vdef7的Setter方法.属性名：自定义项7
* 创建日期:2019-7-30
* @param newVdef7 java.lang.String
*/
public void setVdef7 ( String vdef7) {
this.vdef7=vdef7;
} 
 
/**
* 属性 vdef6的Getter方法.属性名：自定义项6
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef6() {
return this.vdef6;
} 

/**
* 属性vdef6的Setter方法.属性名：自定义项6
* 创建日期:2019-7-30
* @param newVdef6 java.lang.String
*/
public void setVdef6 ( String vdef6) {
this.vdef6=vdef6;
} 
 
/**
* 属性 vdef20的Getter方法.属性名：自定义项20
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef20() {
return this.vdef20;
} 

/**
* 属性vdef20的Setter方法.属性名：自定义项20
* 创建日期:2019-7-30
* @param newVdef20 java.lang.String
*/
public void setVdef20 ( String vdef20) {
this.vdef20=vdef20;
} 
 
/**
* 属性 vdef5的Getter方法.属性名：自定义项5
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef5() {
return this.vdef5;
} 

/**
* 属性vdef5的Setter方法.属性名：自定义项5
* 创建日期:2019-7-30
* @param newVdef5 java.lang.String
*/
public void setVdef5 ( String vdef5) {
this.vdef5=vdef5;
} 
 
/**
* 属性 vdef4的Getter方法.属性名：自定义项4
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef4() {
return this.vdef4;
} 

/**
* 属性vdef4的Setter方法.属性名：自定义项4
* 创建日期:2019-7-30
* @param newVdef4 java.lang.String
*/
public void setVdef4 ( String vdef4) {
this.vdef4=vdef4;
} 
 
/**
* 属性 vdef3的Getter方法.属性名：自定义项3
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef3() {
return this.vdef3;
} 

/**
* 属性vdef3的Setter方法.属性名：自定义项3
* 创建日期:2019-7-30
* @param newVdef3 java.lang.String
*/
public void setVdef3 ( String vdef3) {
this.vdef3=vdef3;
} 
 
/**
* 属性 vdef2的Getter方法.属性名：自定义项2
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef2() {
return this.vdef2;
} 

/**
* 属性vdef2的Setter方法.属性名：自定义项2
* 创建日期:2019-7-30
* @param newVdef2 java.lang.String
*/
public void setVdef2 ( String vdef2) {
this.vdef2=vdef2;
} 
 
/**
* 属性 vdef1的Getter方法.属性名：自定义项1
*  创建日期:2019-7-30
* @return java.lang.String
*/
public String getVdef1() {
return this.vdef1;
} 

/**
* 属性vdef1的Setter方法.属性名：自定义项1
* 创建日期:2019-7-30
* @param newVdef1 java.lang.String
*/
public void setVdef1 ( String vdef1) {
this.vdef1=vdef1;
} 
 
/**
* 属性 生成时间戳的Getter方法.属性名：时间戳
*  创建日期:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* 属性生成时间戳的Setter方法.属性名：时间戳
* 创建日期:2019-7-30
* @param newts nc.vo.pub.lang.UFDateTime
*/
public void setTs(UFDateTime ts){
this.ts=ts;
} 
     
    @Override
    public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("riaam.Dateprivileges_zx");
    }
   }
    