package nc.impl.pub.ace;

import nc.bs.riaam.privileges.ace.bp.AcePrivilegesInsertBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesUpdateBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesDeleteBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesSendApproveBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesUnSendApproveBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesApproveBP;
import nc.bs.riaam.privileges.ace.bp.AcePrivilegesUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.riaam.privileges.AggDateprivileges_zx;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AcePrivilegesPubServiceImpl {
	// ����
	public AggDateprivileges_zx[] pubinsertBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggDateprivileges_zx> transferTool = new BillTransferTool<AggDateprivileges_zx>(
					clientFullVOs);
			// ����BP
			AcePrivilegesInsertBP action = new AcePrivilegesInsertBP();
			AggDateprivileges_zx[] retvos = action.insert(clientFullVOs);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ����BP
			new AcePrivilegesDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// �޸�
	public AggDateprivileges_zx[] pubupdateBills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggDateprivileges_zx> transferTool = new BillTransferTool<AggDateprivileges_zx>(
					clientFullVOs);
			AcePrivilegesUpdateBP bp = new AcePrivilegesUpdateBP();
			AggDateprivileges_zx[] retvos = bp.update(clientFullVOs, originBills);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggDateprivileges_zx[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggDateprivileges_zx[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggDateprivileges_zx> query = new BillLazyQuery<AggDateprivileges_zx>(
					AggDateprivileges_zx.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggDateprivileges_zx[] pubsendapprovebills(
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills)
			throws BusinessException {
		AcePrivilegesSendApproveBP bp = new AcePrivilegesSendApproveBP();
		AggDateprivileges_zx[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggDateprivileges_zx[] pubunsendapprovebills(
			AggDateprivileges_zx[] clientFullVOs, AggDateprivileges_zx[] originBills)
			throws BusinessException {
		AcePrivilegesUnSendApproveBP bp = new AcePrivilegesUnSendApproveBP();
		AggDateprivileges_zx[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggDateprivileges_zx[] pubapprovebills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePrivilegesApproveBP bp = new AcePrivilegesApproveBP();
		AggDateprivileges_zx[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggDateprivileges_zx[] pubunapprovebills(AggDateprivileges_zx[] clientFullVOs,
			AggDateprivileges_zx[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePrivilegesUnApproveBP bp = new AcePrivilegesUnApproveBP();
		AggDateprivileges_zx[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}