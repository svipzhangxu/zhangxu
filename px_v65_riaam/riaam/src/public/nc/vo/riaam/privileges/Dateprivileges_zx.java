package nc.vo.riaam.privileges;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <b> �˴���Ҫ�������๦�� </b>
 * <p>
 *   �˴�����۵�������Ϣ
 * </p>
 *  ��������:2019-7-30
 * @author YONYOU NC
 * @version NCPrj ??
 */
 
public class Dateprivileges_zx extends SuperVO {
	
/**
*����Ȩ������
*/
public String pk_privileges;
/**
*�û�
*/
public String cuserid;
/**
*����
*/
public String pk_group;
/**
*������֯
*/
public String pk_org;
/**
*������֯���°汾
*/
public String pk_org_v;
/**
*�Ƶ���
*/
public String billmaker;
/**
*�Ƶ�����
*/
public UFDate dmakedate;
/**
*������
*/
public String creator;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*����޸���
*/
public String modifier;
/**
*����޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*������
*/
public String approver;
/**
*����ʱ��
*/
public UFDateTime taudittime;
/**
*����״̬
*/
public int fstatusflag;
/**
*��������
*/
public String approvenote;
/**
*�Զ�����0
*/
public String vdef0;
/**
*�Զ�����19
*/
public String vdef19;
/**
*�Զ�����18
*/
public String vdef18;
/**
*�Զ�����17
*/
public String vdef17;
/**
*�Զ�����16
*/
public String vdef16;
/**
*�Զ�����15
*/
public String vdef15;
/**
*�Զ�����14
*/
public String vdef14;
/**
*�Զ�����13
*/
public String vdef13;
/**
*�Զ�����12
*/
public String vdef12;
/**
*�Զ�����11
*/
public String vdef11;
/**
*�Զ�����10
*/
public String vdef10;
/**
*�Զ�����9
*/
public String vdef9;
/**
*�Զ�����8
*/
public String vdef8;
/**
*�Զ�����7
*/
public String vdef7;
/**
*�Զ�����6
*/
public String vdef6;
/**
*�Զ�����20
*/
public String vdef20;
/**
*�Զ�����5
*/
public String vdef5;
/**
*�Զ�����4
*/
public String vdef4;
/**
*�Զ�����3
*/
public String vdef3;
/**
*�Զ�����2
*/
public String vdef2;
/**
*�Զ�����1
*/
public String vdef1;
/**
*ʱ���
*/
public UFDateTime ts;
    
    
/**
* ���� pk_privileges��Getter����.������������Ȩ������
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getPk_privileges() {
return this.pk_privileges;
} 

/**
* ����pk_privileges��Setter����.������������Ȩ������
* ��������:2019-7-30
* @param newPk_privileges java.lang.String
*/
public void setPk_privileges ( String pk_privileges) {
this.pk_privileges=pk_privileges;
} 
 
/**
* ���� cuserid��Getter����.���������û�
*  ��������:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getCuserid() {
return this.cuserid;
} 

/**
* ����cuserid��Setter����.���������û�
* ��������:2019-7-30
* @param newCuserid nc.vo.sm.UserVO
*/
public void setCuserid ( String cuserid) {
this.cuserid=cuserid;
} 
 
/**
* ���� pk_group��Getter����.������������
*  ��������:2019-7-30
* @return nc.vo.org.GroupVO
*/
public String getPk_group() {
return this.pk_group;
} 

/**
* ����pk_group��Setter����.������������
* ��������:2019-7-30
* @param newPk_group nc.vo.org.GroupVO
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
} 
 
/**
* ���� pk_org��Getter����.��������������֯
*  ��������:2019-7-30
* @return nc.vo.org.OrgVO
*/
public String getPk_org() {
return this.pk_org;
} 

/**
* ����pk_org��Setter����.��������������֯
* ��������:2019-7-30
* @param newPk_org nc.vo.org.OrgVO
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
} 
 
/**
* ���� pk_org_v��Getter����.��������������֯���°汾
*  ��������:2019-7-30
* @return nc.vo.vorg.OrgVersionVO
*/
public String getPk_org_v() {
return this.pk_org_v;
} 

/**
* ����pk_org_v��Setter����.��������������֯���°汾
* ��������:2019-7-30
* @param newPk_org_v nc.vo.vorg.OrgVersionVO
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
} 
 
/**
* ���� billmaker��Getter����.���������Ƶ���
*  ��������:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getBillmaker() {
return this.billmaker;
} 

/**
* ����billmaker��Setter����.���������Ƶ���
* ��������:2019-7-30
* @param newBillmaker nc.vo.sm.UserVO
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
} 
 
/**
* ���� dmakedate��Getter����.���������Ƶ�����
*  ��������:2019-7-30
* @return nc.vo.pub.lang.UFDate
*/
public UFDate getDmakedate() {
return this.dmakedate;
} 

/**
* ����dmakedate��Setter����.���������Ƶ�����
* ��������:2019-7-30
* @param newDmakedate nc.vo.pub.lang.UFDate
*/
public void setDmakedate ( UFDate dmakedate) {
this.dmakedate=dmakedate;
} 
 
/**
* ���� creator��Getter����.��������������
*  ��������:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getCreator() {
return this.creator;
} 

/**
* ����creator��Setter����.��������������
* ��������:2019-7-30
* @param newCreator nc.vo.sm.UserVO
*/
public void setCreator ( String creator) {
this.creator=creator;
} 
 
/**
* ���� creationtime��Getter����.������������ʱ��
*  ��������:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getCreationtime() {
return this.creationtime;
} 

/**
* ����creationtime��Setter����.������������ʱ��
* ��������:2019-7-30
* @param newCreationtime nc.vo.pub.lang.UFDateTime
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
} 
 
/**
* ���� modifier��Getter����.������������޸���
*  ��������:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getModifier() {
return this.modifier;
} 

/**
* ����modifier��Setter����.������������޸���
* ��������:2019-7-30
* @param newModifier nc.vo.sm.UserVO
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
} 
 
/**
* ���� modifiedtime��Getter����.������������޸�ʱ��
*  ��������:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getModifiedtime() {
return this.modifiedtime;
} 

/**
* ����modifiedtime��Setter����.������������޸�ʱ��
* ��������:2019-7-30
* @param newModifiedtime nc.vo.pub.lang.UFDateTime
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
} 
 
/**
* ���� approver��Getter����.��������������
*  ��������:2019-7-30
* @return nc.vo.sm.UserVO
*/
public String getApprover() {
return this.approver;
} 

/**
* ����approver��Setter����.��������������
* ��������:2019-7-30
* @param newApprover nc.vo.sm.UserVO
*/
public void setApprover ( String approver) {
this.approver=approver;
} 
 
/**
* ���� taudittime��Getter����.������������ʱ��
*  ��������:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTaudittime() {
return this.taudittime;
} 

/**
* ����taudittime��Setter����.������������ʱ��
* ��������:2019-7-30
* @param newTaudittime nc.vo.pub.lang.UFDateTime
*/
public void setTaudittime ( UFDateTime taudittime) {
this.taudittime=taudittime;
} 
 
/**
* ���� fstatusflag��Getter����.������������״̬
*  ��������:2019-7-30
* @return nc.vo.so.pub.enumeration.BillStatus
*/
public int getFstatusflag() {
return this.fstatusflag;
} 

/**
* ����fstatusflag��Setter����.������������״̬
* ��������:2019-7-30
* @param newFstatusflag nc.vo.so.pub.enumeration.BillStatus
*/
public void setFstatusflag ( int fstatusflag) {
this.fstatusflag=fstatusflag;
} 
 
/**
* ���� approvenote��Getter����.����������������
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getApprovenote() {
return this.approvenote;
} 

/**
* ����approvenote��Setter����.����������������
* ��������:2019-7-30
* @param newApprovenote java.lang.String
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
} 
 
/**
* ���� vdef0��Getter����.���������Զ�����0
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef0() {
return this.vdef0;
} 

/**
* ����vdef0��Setter����.���������Զ�����0
* ��������:2019-7-30
* @param newVdef0 java.lang.String
*/
public void setVdef0 ( String vdef0) {
this.vdef0=vdef0;
} 
 
/**
* ���� vdef19��Getter����.���������Զ�����19
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef19() {
return this.vdef19;
} 

/**
* ����vdef19��Setter����.���������Զ�����19
* ��������:2019-7-30
* @param newVdef19 java.lang.String
*/
public void setVdef19 ( String vdef19) {
this.vdef19=vdef19;
} 
 
/**
* ���� vdef18��Getter����.���������Զ�����18
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef18() {
return this.vdef18;
} 

/**
* ����vdef18��Setter����.���������Զ�����18
* ��������:2019-7-30
* @param newVdef18 java.lang.String
*/
public void setVdef18 ( String vdef18) {
this.vdef18=vdef18;
} 
 
/**
* ���� vdef17��Getter����.���������Զ�����17
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef17() {
return this.vdef17;
} 

/**
* ����vdef17��Setter����.���������Զ�����17
* ��������:2019-7-30
* @param newVdef17 java.lang.String
*/
public void setVdef17 ( String vdef17) {
this.vdef17=vdef17;
} 
 
/**
* ���� vdef16��Getter����.���������Զ�����16
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef16() {
return this.vdef16;
} 

/**
* ����vdef16��Setter����.���������Զ�����16
* ��������:2019-7-30
* @param newVdef16 java.lang.String
*/
public void setVdef16 ( String vdef16) {
this.vdef16=vdef16;
} 
 
/**
* ���� vdef15��Getter����.���������Զ�����15
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef15() {
return this.vdef15;
} 

/**
* ����vdef15��Setter����.���������Զ�����15
* ��������:2019-7-30
* @param newVdef15 java.lang.String
*/
public void setVdef15 ( String vdef15) {
this.vdef15=vdef15;
} 
 
/**
* ���� vdef14��Getter����.���������Զ�����14
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef14() {
return this.vdef14;
} 

/**
* ����vdef14��Setter����.���������Զ�����14
* ��������:2019-7-30
* @param newVdef14 java.lang.String
*/
public void setVdef14 ( String vdef14) {
this.vdef14=vdef14;
} 
 
/**
* ���� vdef13��Getter����.���������Զ�����13
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef13() {
return this.vdef13;
} 

/**
* ����vdef13��Setter����.���������Զ�����13
* ��������:2019-7-30
* @param newVdef13 java.lang.String
*/
public void setVdef13 ( String vdef13) {
this.vdef13=vdef13;
} 
 
/**
* ���� vdef12��Getter����.���������Զ�����12
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef12() {
return this.vdef12;
} 

/**
* ����vdef12��Setter����.���������Զ�����12
* ��������:2019-7-30
* @param newVdef12 java.lang.String
*/
public void setVdef12 ( String vdef12) {
this.vdef12=vdef12;
} 
 
/**
* ���� vdef11��Getter����.���������Զ�����11
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef11() {
return this.vdef11;
} 

/**
* ����vdef11��Setter����.���������Զ�����11
* ��������:2019-7-30
* @param newVdef11 java.lang.String
*/
public void setVdef11 ( String vdef11) {
this.vdef11=vdef11;
} 
 
/**
* ���� vdef10��Getter����.���������Զ�����10
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef10() {
return this.vdef10;
} 

/**
* ����vdef10��Setter����.���������Զ�����10
* ��������:2019-7-30
* @param newVdef10 java.lang.String
*/
public void setVdef10 ( String vdef10) {
this.vdef10=vdef10;
} 
 
/**
* ���� vdef9��Getter����.���������Զ�����9
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef9() {
return this.vdef9;
} 

/**
* ����vdef9��Setter����.���������Զ�����9
* ��������:2019-7-30
* @param newVdef9 java.lang.String
*/
public void setVdef9 ( String vdef9) {
this.vdef9=vdef9;
} 
 
/**
* ���� vdef8��Getter����.���������Զ�����8
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef8() {
return this.vdef8;
} 

/**
* ����vdef8��Setter����.���������Զ�����8
* ��������:2019-7-30
* @param newVdef8 java.lang.String
*/
public void setVdef8 ( String vdef8) {
this.vdef8=vdef8;
} 
 
/**
* ���� vdef7��Getter����.���������Զ�����7
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef7() {
return this.vdef7;
} 

/**
* ����vdef7��Setter����.���������Զ�����7
* ��������:2019-7-30
* @param newVdef7 java.lang.String
*/
public void setVdef7 ( String vdef7) {
this.vdef7=vdef7;
} 
 
/**
* ���� vdef6��Getter����.���������Զ�����6
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef6() {
return this.vdef6;
} 

/**
* ����vdef6��Setter����.���������Զ�����6
* ��������:2019-7-30
* @param newVdef6 java.lang.String
*/
public void setVdef6 ( String vdef6) {
this.vdef6=vdef6;
} 
 
/**
* ���� vdef20��Getter����.���������Զ�����20
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef20() {
return this.vdef20;
} 

/**
* ����vdef20��Setter����.���������Զ�����20
* ��������:2019-7-30
* @param newVdef20 java.lang.String
*/
public void setVdef20 ( String vdef20) {
this.vdef20=vdef20;
} 
 
/**
* ���� vdef5��Getter����.���������Զ�����5
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef5() {
return this.vdef5;
} 

/**
* ����vdef5��Setter����.���������Զ�����5
* ��������:2019-7-30
* @param newVdef5 java.lang.String
*/
public void setVdef5 ( String vdef5) {
this.vdef5=vdef5;
} 
 
/**
* ���� vdef4��Getter����.���������Զ�����4
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef4() {
return this.vdef4;
} 

/**
* ����vdef4��Setter����.���������Զ�����4
* ��������:2019-7-30
* @param newVdef4 java.lang.String
*/
public void setVdef4 ( String vdef4) {
this.vdef4=vdef4;
} 
 
/**
* ���� vdef3��Getter����.���������Զ�����3
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef3() {
return this.vdef3;
} 

/**
* ����vdef3��Setter����.���������Զ�����3
* ��������:2019-7-30
* @param newVdef3 java.lang.String
*/
public void setVdef3 ( String vdef3) {
this.vdef3=vdef3;
} 
 
/**
* ���� vdef2��Getter����.���������Զ�����2
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef2() {
return this.vdef2;
} 

/**
* ����vdef2��Setter����.���������Զ�����2
* ��������:2019-7-30
* @param newVdef2 java.lang.String
*/
public void setVdef2 ( String vdef2) {
this.vdef2=vdef2;
} 
 
/**
* ���� vdef1��Getter����.���������Զ�����1
*  ��������:2019-7-30
* @return java.lang.String
*/
public String getVdef1() {
return this.vdef1;
} 

/**
* ����vdef1��Setter����.���������Զ�����1
* ��������:2019-7-30
* @param newVdef1 java.lang.String
*/
public void setVdef1 ( String vdef1) {
this.vdef1=vdef1;
} 
 
/**
* ���� ����ʱ�����Getter����.��������ʱ���
*  ��������:2019-7-30
* @return nc.vo.pub.lang.UFDateTime
*/
public UFDateTime getTs() {
return this.ts;
}
/**
* ��������ʱ�����Setter����.��������ʱ���
* ��������:2019-7-30
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
    