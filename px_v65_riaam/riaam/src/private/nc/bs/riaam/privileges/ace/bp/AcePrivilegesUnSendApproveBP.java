package nc.bs.riaam.privileges.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AcePrivilegesUnSendApproveBP {

	public AggDateprivileges_zx[] unSend(AggDateprivileges_zx[] clientBills,
			AggDateprivileges_zx[] originBills) {
		// ��VO�־û������ݿ���
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggDateprivileges_zx> update = new BillUpdate<AggDateprivileges_zx>();
		AggDateprivileges_zx[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggDateprivileges_zx[] clientBills) {
		for (AggDateprivileges_zx clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("${vmObject.billstatus}",
					BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
