package nc.bs.riaam.privileges_zx.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼���������BP
 */
public class AcePrivileges_zxSendApproveBP {
	/**
	 * ������
	 * 
	 * @param vos
	 *            ����VO����
	 * @param script
	 *            ���ݶ����ű�����
	 * @return �����ĵ���VO����
	 */

	public AggDateprivileges_zx[] sendApprove(AggDateprivileges_zx[] clientBills,
			AggDateprivileges_zx[] originBills) {
		for (AggDateprivileges_zx clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���ݳ־û�
		AggDateprivileges_zx[] returnVos = new BillUpdate<AggDateprivileges_zx>().update(
				clientBills, originBills);
		return returnVos;
	}
}
