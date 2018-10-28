package com.hiaward.product.quicktrans.common.constant;


/**
 * <p>
 * xBankBass常量定义
 * </p>
 */
public abstract class Constant
{
    /**
     * 终端类型定义
     */
    public static final int TERMTYPE_SELF_SERVICE = 1; 	// 自助终端
    public static final int TERMTYPE_PDA = 2; 		// PDA终端
    public static final int TERMTYPE_TELLER = 3; 	// 柜员终端
    public static final int TERMTYPE_OPERATOR = 4; 	// 大厅工作人员终端
    public static final int TERMTYPE_TC = 5;            // 出纳机终端
    public static final int TERMTYPE_QSTELLER = 6;      // 快速服务柜员终端
    public static final int TERMTYPE_AUTELLER = 7;   // 授权柜员终端
    
    public static final int SOCKET_PDA_PORT = 3801; 	// PDA Socket通信端口
    public static final int SOCKET_MIBS_PORT = 6000; 	// 民生柜面端口
    public static final int SOCKET_TIMEOUT = 5; 	// Socket通信超时秒数
    //add by buxishuan
    public static final String INQUIRYDETAILACCOUNT = "12";//一次性查询笔数 add by buxishuan fo ljbnak 2012/11/17
    //public static String ReturnMessage = "";//报文返回信息

    /**
     * 队列类型定义
     */
    public static final int QUEUETYPE_FAST_PROCESS = 1; // 快速处理队列
    public static final int QUEUETYPE_PRIVATE = 2; 	// 对私队列
    public static final int QUEUETYPE_PUBLIC = 3; 	// 对公队列
    public static final int QUEUETYPE_RESERVE = 4; 	// 预约队列
    public static final int QUEUETYPE_VIP = 5; 		// Vip队列
    
    /**
     * 流水号长度，此处长度用于23为流水号映射使用
     */
    public static final int SERIALNUMBER_LENGTH = 6; 		// Vip队列
    
    /**
     * 数据库中空值定义 
     */
    public static final String DATABASE_NULL = "N/A";

    /**
     * 排队状态定义
     */
    public static final int QUEUEITEM_STATUS_WAITTING = 1; 	// 等待中
    public static final int QUEUEITEM_STATUS_PROCESSING = 2; 	// 处理中
    public static final int QUEUEITEM_STATUS_COMPLETED = 3; 	// 已完成
    public static final int QUEUEITEM_STATUS_CANCELED = 4; 	// 已取消
    public static final int QUEUEITEM_STATUS_TRANSFERED = 5; 	// 转柜办理
    
    /**
     * 柜员锁屏登陆验密会更新数据，授权验密未操作数据库 1：登陆，2：授权
     */
    public static final String CHECKED_TYPE_TELLERVERIFY = "1";
    public static final String CHECKED_TYPE_AUTHORIZATION = "2";
    /**
     * 冲正流水是使用核心流水号还是前端流水号,1为前端,2为核心
     */
    public static final String FrontJournalSequence_querytype = "1";
    public static final String BackendJournalSequence_querytype = "2";
    /**
     * 柜员登录结果定义
     */
    public static final String LOGIN_STATUS_SUCCESS = "success";        // 登录成功
    public static final String LOGIN_STATUS_FAIL = "fail";              // 登录失败
    
    /**
     * 窗口状态定义
     */
    public static final int WINDOW_STATUS_FREE = 1; 		// 空闲
    public static final int WINDOW_STATUS_PROCESSING = 2; 	// 占用(处理中)
    public static final int WINDOW_STATUS_SUSPENDED = 3; 	// 已暂停服务
    public static final int WINDOW_STATUS_CLOSED = 4; 		// 已关闭

    /**
     * 柜员状态定义
     */
    public static final int TELLER_STATUS_LOGOUT = 0;           // 退录
    //modify buxishuan 2012-5-21
    public static final int TELLER_STATUS_LOGIN = 2;       		//柜员状态为登录系统
    public static final int TELLER_STATUS_SUSPENDED = 3;        // 临时签退服务
    public static final int TELLER_STATUS_RESUME = 4;           // 恢复服务(暂停服务的反操作)
    public static final int TELLER_STATUS_REFUNCE = 5;          // 拒绝受理(暂停服务前的中间状态)
    //add by buxishuan 2012-5-21
    public static final int TELLER_STATUS_OPEN = 1;				//柜员登录状态为开启

    /**
     * 评价等级定义
     */
    public static final int SCORE_VERY_SATISFIED = 3; 	// 非常满意
    public static final int SCORE_SATISFIED = 2; 	// 满意
    public static final int SCORE_DISSATISFIED = 1; 	// 不满意

    /**
     * 预约类型定义
     */
    public static final int RESERVATION_TYPE_COARSE = 1; 	// 普通预约
    public static final int RESERVATION_TYPE_FINE = 2; 		// 精确预约
    public static final String RESERVATION_NUM_PREFIX = "R-"; 	// 预约号前缀
    public static final int RESERVATION_NUM_LENGTH = 3; 	// 预约号数字部分长度

    /**
     * 预约有效期状态定义
     */
    public static final int RESERVATION_BEFORE_VALID_PERIOD = -1; 	// 有效期之前
    public static final int RESERVATION_AMONG_VALID_PERIOD = 0; 	// 有效期之内
    public static final int RESERVATION_AFTER_VALID_PERIOD = 1; 	// 有效期之后
    public static final int RESERVATION_COARSE_EXPIRE_DAYS = 7; 	// 普通预约过期天数
    public static final int RESERVATION_MIN_RESERVED_HOURES = 3; 	// 可预约最小期限小时数
    public static final int RESERVATION_FINE_VALID_ACTIVATION_MINUTES = 30; // 精确预约激活有效期分钟数

    /**
     * Socket消息通知分类
     */
    public static final int SOCKETMSG_CATEGORY_CALL_LOBBYMANAGER = 1;        // 呼叫大堂经理
    public static final int SOCKETMSG_CATEGORY_VERIFY_IDENTITY = 2;          // 身份验证请求
    public static final int SOCKETMSG_CATEGORY_LOWER_EVALUATION = 3;         // 服务满意度评价过低
    public static final int SOCKETMSG_CATEGORY_VIP_SERVICE = 4;              // Vip客户迎送
    
    /**
     * Socket消息通知状态
     */
    public static final int SOCKETMSG_STATUS_NOT_PROCESSED = 1;       // 未处理
    public static final int SOCKETMSG_STATUS_PROCESSED = 2;           // 已处理
    
    /**
     * 交易处理状态
     */
    public static final int STATUS_COMPLETED = 0;           // 已处理
    public static final int STATUS_NOT_COMPLETED = 1;       // 未处理
    public static final int STATUS_CANCELED = 2;            // 已取消
    
    /**
     * 签到场景编号
     */
    public static final String TELLER_LOGIN_SCENARIONUM = "SC09301010";
    public static final String TELLER_CASHREGISTER = "SC09301023";//长短款登记
    public static final String TELLER_CASHREVOCATION = "SC09301025";//长短款撤销
    

    /**
     * 交易处理状态
     */
    public static final int PARENT_MENU_ID_FOR_TOP_MENUS = -1;          //顶级菜单
    public static final int PARENT_MENU_ID_FOR_ALL_MENUS = -2;          //所有菜单
    public static final int PARENT_MENU_ID_FOR_OPERTIONAL_ACTIONS = -3; //
    
    /**
     * 龙江银行渠道号
     */
    public static final String AUTHSCENARIONUM = "SC09001010";//授权场景编号
    /**
     * 默认广告时快柜编号
     */
    public static final String DEFAULT_RECOMMENDAD_QUICKCOUNTERNUM = "-1";
    
    /**
     * IC卡圈存冲正标志
     */
    public static final String LOADINGREVERSE = "loadingreverse";
    
    /**
     * XPAHT读取路径
     */
    public static final String XPATHSPLIT = "/";
    
    
    /**
     * TR报文中用于分割头报文中描述字段数据
     */
    public static final String REQUESTSTATUSCODEDESCSPLIT = ";";

    /**
     * TellerCashRecord表中记录标记
     */
    public static final int FLAG_TELLERCASH = 1;                        // 自动柜员出纳机流水记录标志
    public static final int FLAG_TELLERDRAWER = 2;                      // 零钞柜流水记录标志

    /**
     * TellerCashRecord表中记录标记
     */
    public static final int CAN_PAY_CHANGE = 0;                     //可以支付零钞
    public static final int MAX_PAY_CHANGE_NUM = 10;                //某类面值的零钞的最大支付数量
    
    /**
     * TellerCashRecord表中记录标记
     */
    public static final int TASKTYPE_IN = 0;                        //表示TellerCash任务"in"方向
    public static final int TASKTYPE_OUT = 1;                       //表示TellerCash任务"out"方向
    
    /**
     * TransLogCheckAccount表中的扎帐类型
     */
    public static final int CHECKACCOUT_TYPE_MIDDAY = 1;          //表示日间扎帐
    public static final int CHECKACCOUT_TYPE_ENDDAY = 2;          //表示日终扎帐
    public static final int CHECKACCOUT_MIDDAY_NUM = 5;           //表示每天只能进行5此日间扎帐
    public static final int CHECKACCOUT_ENDDAY_NUM = 1;           //表示每天只能进行1此日中扎帐

    /**
     * 零钞箱服务
     */
    public static final String TOTALAMOUNT_FLAG = "0";              //总金额标记
    
    /**
     * 页面默认风格
     */
    public static final String CSS_DEFAULT = "default.css";

    /**
     * 终端交易状态
     */
    public static final int CDMSTATUS_NOACT = 0;                 // 终端交易状态:未动作
    public static final int CDMSTATUS_PRESENT = 1;               // 终端交易状态:已送钞
    public static final int CDMSTATUS_DISPFAILED = 2;            // 终端交易状态:出钞失败
    public static final int CDMSTATUS_UNCER = 3;                 // 终端交易状态:结果不确定
    
    /**
     * 冲正状态
     */
    public static final int CWCSTATUS_NEEDLESS = 0;              // 冲正状态:未冲正
    public static final int CWCSTATUS_OK = 1;                    // 冲正状态:成功
    public static final int CWCSTATUS_FAILED = 2;                // 冲正状态:失败
    public static final int CWCSTATUS_UNCER = 3;                 // 冲正状态:结果不确定
    public static final String IPP_NOT_ACCOUNT = "EGG0862";		 //IPP没有记账 add by buxishuan for ljbank 2012/11/27
    
    /**
     * 快窗系统，自行定义的交易码
     * 2012/12/13 buxishuan
     */
    public static final String DEPOSIT_TRANSCODE = "1001";	 
    public static final String WITHDRAW_TRANSCODE = "1002";	 
    public static final String TRANSFER_TRANSCODE = "1003";	 
    
    /**
     * 对账结果
     */
    public static final int CARESULT_NEEDLESS = 0;              // 对账结果:不需要对账
    public static final int CARESULT_EVEN = 1;                  // 对账结果:对平
    public static final int CARESULT_EXCESS = 2;                // 对账结果:长款
    public static final int CARESULT_SUSPECT = 3;               // 对账结果:疑问账
    
    
    /**
     * 对警告信息信息操作标志
     */
    public static final String DELETEWARNINGINFO = "1";              // 删除预警信息
    
    public static final String TELLERTHRESHOLDDEPOSITNUMTYPE = "4";//柜员零钞存款预警阀值
    public static final String TELLERTHRESHOLDWITHDRAWNUMTYPE = "5";//柜员零钞取款预警阀值
    public static final String QTMTHRESHOLDDEPOSITNUMTYPE = "1";//QTM存满预警阀值
    public static final String QTMTHRESHOLDWITHDRAWNUMTYPE = "2";//QTM取款取空阀值
    public static final String QTMTHRESHOLDWITHDRAWWARNNUMTYPE = "3";//QTM取款预警阀值
    
    /**
     * 主机报文返回结果
     */
    public static final String TERMRETCODE_SUCCEED = "0000";
    public static final String TERMRETDESC_SUCCEED = "成功";
    public static final String TERMRETDESCEN_SUCCEED = "Succeed";
    public static final String TERMRETCODE_COMMERR = "0001";
    public static final String TERMRETDESC_COMMERR = "通讯故障";
    public static final String TERMRETDESCEN_COMMERR = "Comm error";
    public static final String TERMRETCODE_COMMUNC = "0002";
    public static final String TERMRETDESC_COMMUNC = "通讯异常，交易结果不确定";
    public static final String TERMRETCODE_ERROR_VALIDATE = "0003";
    public static final String TERMRETDESC_ERROR_VALIDATE = "IC卡验卡失败";
    public static final String TERMRETDESCEN_COMMUNC = "Comm uncertain";
    public static final String TERMRETDESCEN_INNERR = "System error";
    public static final String TERMRETDESC_INNERR = "内部错误";
    
    /**
     * add by buxishuan for ljbank 2012/12/15
     */
    public static final String CARDTYPE_OTHER = "20000"; 			// 他行卡(或未能识别卡号)
    public static final String CARDTYPE_CREDITCARD = "12000";//信用卡
    public static final String CARDTYPE_JIEJICARD = "11000";//磁条借记卡
    public static final String CARDTYPE_PASSBOOK = "20001";//活期存折
    public static final String CARDTYPE_ONE_PASSBOOK="20002";//活期一本通
    public static final String CARDTYPE_ICCARD = "13000";//IC卡
    
    /**
     * 服务类型，包含在公共报文头中
     */
    public static final String SERVICENAME_GETWORKINGKEY = "getWorkingKey";
    public static final String SERVICENAME_GETTERMINFO = "GetTermInfo";
    public static final String SERVICENAME_GETSCENARIOCONFIG = "getScenarioConfigCmd";
    public static final String SERVICENAME_GETSERVICEMENU = "GetServiceMenu";
    public static final String SERVICENAME_VALIDATECARDSERVICE = "ValidateCardService";
    public static final String SERVICENAME_PREPROCESSINFO = "PreprocessInfo";
    public static final String SERVICENAME_QUEUESERVICESELECT = "QueueServiceSelect";
    public static final String SERVICENAME_LISTBRANCHQUEUEINFO = "ListBranchQueueInfo";
    public static final String SERVICENAME_QUEUEPROCESSSMSNOTIFY = "QueueProcessSmsNotify";
    public static final String SERVICENAME_SMSNOTIFY = "SmsNotify";
    public static final String SERVICENAME_PRIVATEBALANCEQUERY = "PrivateBalanceQuery";
    public static final String SERVICENAME_GETTELLERCASHERTERMS = "GetTellerCasherTerms";
    public static final String SERVICENAME_GETTERMSTATUS = "GetTermsStatus";
    public static final String SERVICENAME_TELLERCASHEROPERATE = "TellerCasherOperate";
    public static final String SERVICENAME_CHANGEBOXOPERATE = "ChangeBoxOperate";
    public static final String SERVICENAME_CHANGEBOXINCANCEL = "ChangeBoxIncancel";
    public static final String SERVICENAME_GETTELLERCASHERREALINFO = "GetTellerCashRealInfo";
    public static final String SERVICENAME_GETTHRESHOLDINFOCMD = "getThresholdInfoCmd";

    /**
     * 报文类型，包含在公共报文头中
     * 说明：
     *  用于将多种报文放在同一个服务中处理
     *  或
     *  报文需要转发给客户端处理（客户端处理一般使用的时报文头中的MessageType节点）
     */
    public static final String MESSAGETYPE_TELLERNOTESTASK = "TellerNotesTask";
    
    /**
     * xml路径根节点名称
     */
    public static final String XPATH_ROOT = "xBankBass";
    

    /**
     * 公共报文头
     */
    public static final String XPATH_MESSAGEHEAD_SERVICENAME = "xBankBass/MessageHead/ServiceName";
    public static final String XPATH_MESSAGEHEAD_TRANSACTIONNAME = "xBankBass/MessageHead/TransactionName";
    public static final String XPATH_MESSAGEHEAD_RETCODE = "xBankBass/MessageHead/RetCode";
    public static final String XPATH_MESSAGEHEAD_RETDESC = "xBankBass/MessageHead/RetDesc";
    public static final String XPATH_MESSAGEHEAD_RETDESCEN = "xBankBass/MessageHead/RetDescEn";
    public static final String XPATH_MESSAGEHEAD_MESSAGETYPE = "xBankBass/MessageHead/MessageType";
    public static final String XPATH_MESSAGEHEAD_MAC = "xBankBass/MessageHead/Mac";
    public static final String XPATH_MESSAGEHEAD_TERMNUM = "xBankBass/MessageHead/TermNum";
    public static final String XPATH_MESSAGEHEAD_TERMTYPE = "xBankBass/MessageHead/TermType";
    
    // 2010-9-14 zhouhui
    public static final String XPATH_MESSAGEHEAD_BRANCHNUM = "xBankBass/MessageHead/BranchNum";
    public static final String XPATH_MESSAGEHEAD_SUBBRANCHNUM = "xBankBass/MessageHead/SubBranchNum";
    public static final String XPATH_REQUEST_OPERATORTYPE =  "xBankBass/Request/OperatorTYPE";
    public static final String XPATH_REQUEST_OPERATAMOUNT =  "xBankBass/Request/OperatorAmount";
		
    /**
     * 获取终端信息服务
     */
    // request
    public static final String XPATH_REQUEST_QTMCLEANTOTALAMOUNT = "xBankBass/Request/QtmCleanTotalAmount";//QTM清机清点总金额
    public static final String XPATH_REQUEST = "xBankBass/Request";
    public static final String XPATH_REQUEST_TELLERNOTES = "xBankBass/Request/TellerNotes";
    public static final String XPATH_REQUEST_NETADDR = "xBankBass/Request/NetAddr";
    public static final String XPATH_REQUEST_PINPADUID = "xBankBass/Request/PinPadUID";
    public static final String XPATH_REQUEST_REFRESHBUF_TARGETOBJECT = "xBankBass/Request/RefreshBuf/TargetObject";
    public static final String XPATH_REQUEST_REFRESHBUF_ID = "xBankBass/Request/RefreshBuf/Id";
    public static final String XPATH_REQUEST_ACTION_FORWARDNAME = "xBankBass/Request/Action/ForwardName";
    public static final String XPATH_REQUEST_PARENTSERVICEID = "xBankBass/Request/ParentServiceId";
    public static final String XPATH_REQUEST_TERMNUM = "xBankBass/Request/TermNum";
    public static final String XPATH_REQUEST_AMOUNT = "xBankBass/Request/Amount";
    public static final String XPATH_REQUEST_OKIAMOUNT = "xBankBass/Request/OKIAmount";
    public static final String XPATH_REQUEST_CASHDRAWERAMOUNT = "xBankBass/Request/CashDrawerAmount";
    public static final String XPATH_REQUEST_TERMTRANSSTATUS = "xBankBass/Request/TermTransStatus";
    public static final String XPATH_REQUEST_ISERVICESTATUS = "xBankBass/Request/iservicestatus";
    public static final String XPATH_REQUEST_TRANSACTIONTSN = "xBankBass/Request/TransactionTsn";
    public static final String XPATH_MESSAGEHEAD_TransactionUUID = "xBankBass/MessageHead/TransactionUUID";
    public static final String XPATH_REQUEST_TRANSTYPE = "xBankBass/Request/TransType";
    public static final String XPATH_REQUEST_CARDMETHOD = "xBankBass/Request/CardMethod";
    public static final String XPATH_REQUEST_SVCSTATUS = "xBankBass/Request/SvcStatus";
    public static final String XPATH_REQUEST_COMMSTATUS = "xBankBass/Request/CommStatus";
    public static final String XPATH_REQUEST_DEVICESTATUS = "xBankBass/Request/DeviceStatus";
    public static final String XPATH_REQUEST_DEVICE_CARDREADER = "xBankBass/Request/DeviceStatus/CardReader";
    public static final String XPATH_REQUEST_DEVICE_PINPAD = "xBankBass/Request/DeviceStatus/PinPad";
    public static final String XPATH_REQUEST_DEVICE_CASHACCEPTOR = "xBankBass/Request/DeviceStatus/CashAcceptor";
    public static final String XPATH_REQUEST_DEVICE_CASHDISPENSER = "xBankBass/Request/DeviceStatus/CashDispenser";
    public static final String XPATH_REQUEST_DEVICE_STATUS = "Status";
    public static final String XPATH_REQUEST_DEVICE_ERRORSTRING = "ErrorString";
    public static final String XPATH_REQUEST_CASSUNITINFO = "xBankBass/Request/CassUnitInfo";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORDS_RECORD = "xBankBass/Request/CassUnitInfo/Records/Record";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORDS = "Records";
    public static final String XPATH_REQUEST_CASSUNITINFO_RECORD = "Record";
    public static final String XPATH_REQUEST_CASSUNITINFO_UNITID = "UnitID";
    public static final String XPATH_REQUEST_CASSUNITINFO_TYPE = "Type";
    public static final String XPATH_REQUEST_CASSUNITINFO_CURRENCY = "Currency";
    public static final String XPATH_REQUEST_CASSUNITINFO_VALUE = "Value";
    public static final String XPATH_REQUEST_CASSUNITINFO_INITIALCOUNT = "InitialCount";
    public static final String XPATH_REQUEST_CASSUNITINFO_COUNT = "Count";
    public static final String XPATH_REQUEST_CASSUNITINFO_STATUS = "Status";
    public static final String XPATH_REQUEST_CASSUNITINFO_CASHTOTAL = "CashTotal";
    public static final String XPATH_REQUEST_DESTINATION = "xBankBass/Request/Destination";
    public static final String XPATH_REQUEST_TELLERNOTES_CARDNUM = "xBankBass/Request/TellerNotes/CardNum";
    public static final String XPATH_REQUEST_TELLERNOTES_DATETIME = "xBankBass/Request/TellerNotes/DateTime";
    public static final String XPATH_REQUEST_TELLERNOTES_TYPE = "xBankBass/Request/TellerNotes/Type";
    public static final String XPATH_REQUEST_TELLERNOTES_AMOUNT = "xBankBass/Request/TellerNotes/Amount";
    public static final String XPATH_REQUEST_MAXCOUNT = "xBankBass/Request/MaxCount";
    public static final String XPATH_REQUEST_PAGENO = "xBankBass/Request/PageNo";//分页显示时表示查询第几页
    public static final String XPATH_REQUEST_RECORDS_PER_PAGE = "xBankBass/Request/RecordsPerPage";//分页显示时表示每页记录数，为0表示不分页
    public static final String XPATH_REQUEST_TYPE = "xBankBass/Request/Type";
    public static final String XPATH_REQUEST_TRANSACTIONNAME = "xBankBass/Request/TransactionName";
    public static final String XPATH_REQUEST_SCREENHELP = "xBankBass/Request/ScreenHelp";
    public static final String XPATH_REQUEST_SCREENHELP_TYPE = "xBankBass/Request/ScreenHelp/Type";
    public static final String XPATH_REQUEST_SCREENHELP_DATETIME = "xBankBass/Request/ScreenHelp/DateTime";
    public static final String XPATH_REQUEST_SCREENHELP_TASKID = "xBankBass/Request/ScreenHelp/TaskId";
    public static final String XPATH_REQUEST_SCREENHELP_RESULT = "xBankBass/Request/ScreenHelp/Result";
    public static final String XPATH_REQUEST_SCREENHELP_TERMNUM = "xBankBass/Request/ScreenHelp/TermNum";
    public static final String XPATH_REQUEST_CASHDRAWERMONEYFLAG = "xBankBass/Request/CashDrawerMoneyFlag";
    public static final String XPATH_REQUEST_CASHDRAWERMONEY = "xBankBass/Request/CashDrawerMoney";
    public static final String XPATH_REQUEST_DEALJOURNALTYPE = "xBankBass/Request/DealJournalType";
    
    public static final String XPATH_REQUEST_CARDNUM = "xBankBass/Request/CardNum";
    public static final String XPATH_REQUEST_CHANGECARD = "xBankBass/Request/ChangeCard";
    public static final String XPATH_REQUEST_CHANGECARD_TYPE = "xBankBass/Request/ChangeCard/Type";
    public static final String XPATH_REQUEST_CHANGECARD_TASKID = "xBankBass/Request/ChangeCard/TaskId";
    public static final String XPATH_REQUEST_CHANGECARD_TERMNUM = "xBankBass/Request/ChangeCard/TermNum";
    
    
    public static final String XPATH_REQUEST_VALIDATECARDNUM = "xBankBass/Request/ValidateCardNum";
    public static final String XPATH_REQUEST_PAYMENT_TYPE = "xBankBass/Request/PayMent/Type";
    public static final String XPATH_REQUEST_PAYMENT_TASKID = "xBankBass/Request/PayMent/TaskId";
    public static final String XPATH_REQUEST_PAYMENT_TERMNUM = "xBankBass/Request/PayMent/TermNum";
    public static final String XPATH_REQUEST_PAYMENT_ACCOUNT = "xBankBass/Request/PayMent/Account";
    public static final String XPATH_REQUEST_PAYMENT_DATETIME = "xBankBass/Request/PayMent/DateTime";
    public static final String XPATH_REQUEST_PAYMENT_AMOUNT = "xBankBass/Request/PayMent/Amount";
    public static final String XPATH_REQUEST_PAYMENT = "xBankBass/Request/PayMent";
    public static final String XPATH_REQUEST_PAYMENTACCOUNT = "xBankBass/Request/PaymentAccount";
    public static final String XPATH_REQUEST_PAYMENTAMOUNT = "xBankBass/Request/PaymentAmount";
    public static final String XPATH_REQUEST_PAYMENTTYPE = "xBankBass/Request/PaymentType";
    public static final String XPATH_REQUEST_TRACK1 = "xBankBass/Request/Track1";
    public static final String XPATH_REQUEST_OUTCARDNUM = "xBankBass/Request/OutCardNum";
    public static final String XPATH_REQUEST_INCARDNUM = "xBankBass/Request/InCardNum";
    public static final String XPATH_REQUEST_TRANSAMOUNT = "xBankBass/Request/TransAmount";
    public static final String XPATH_REQUEST_TRACK2 = "xBankBass/Request/Track2";
    public static final String XPATH_REQUEST_TRACK3 = "xBankBass/Request/Track3";
    public static final String XPATH_REQUEST_PINBLOCK = "xBankBass/Request/PinBlock";
    public static final String XPATH_REQUEST_TERMSERIALNUM = "xBankBass/Request/TermSerialNum";
    // add by  buxishuan for update card password 2011-12-26
    public static final String XPATH_REQUEST_NEWPINBLOCK = "xBankBass/Request/NewPinBlock";
    public static final String XPATH_MESSAGEHEAD_TYPE = "xBankBass/MessageHead/CardType";
    //授权标志 add by buxishuan
    public static final String XPATH_MESSAGEHEAD_ISAUTHORIZATION = "xBankBass/MessageHead/IsAuthorization";
  
    
    //信用卡还款 add by ouwanjun 2011-11-08
    public static final String XPATH_REQUEST_TRANSFERTYPE = "xBankBass/Request/TransferType";
    //区分零钞箱日志类型
    public static final String XPATH_REQUEST_STRNODETYPE = "xBankBass/Request/strNodeType";
     
    //masterKey
    public static final String XPATH_REQUEST_MASTERKEY = "xBankBass/Request/MasterKey";
    
    public static final String XPATH_REQUEST_PRINTBANKBOOK = "xBankBass/Request/PrintBankbook";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TASKID = "xBankBass/Request/PrintBankbook/TaskId";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TERMNUM = "xBankBass/Request/PrintBankbook/TermNum";
    public static final String XPATH_REQUEST_PRINTBANKBOOK_TYPE = "xBankBass/Request/PrintBankbook/Type";
    
    //凭条打印
    public static final String XPATH_REQUEST_PRINTPRO = "xBankBass/Request/PrintPro";
    public static final String XPATH_REQUEST_PRINTPRO_TASKID = "xBankBass/Request/PrintPro/TaskId";
    public static final String XPATH_REQUEST_PRINTPRO_TERMNUM = "xBankBass/Request/PrintPro/TermNum";
    public static final String XPATH_REQUEST_PRINTPRO_BRANCHNUM = "xBankBass/Request/PrintPro/BranchNum";
    public static final String XPATH_REQUEST_PRINTPRO_TYPE = "xBankBass/Request/PrintPro/Type";
    
    public static final String XPATH_REQUEST_REPORTLOST = "xBankBass/Request/ReportLost";
    public static final String XPATH_REQUEST_REPORTLOST_TYPE = "xBankBass/Request/ReportLost/Type";
    public static final String XPATH_REQUEST_REPORTLOST_TASKID = "xBankBass/Request/ReportLost/TaskId";
    public static final String XPATH_REQUEST_REPORTLOST_TERMNUM = "xBankBass/Request/ReportLost/TermNum";
    
    public static final String XPATH_REQUEST_CUSTOMTIME_STARTTIME = "xBankBass/Request/StartTime";
    public static final String XPATH_REQUEST_CUSTOMTIME_ENDTIME = "xBankBass/Request/EndTime";
    public static final String XPATH_REQUEST_CUSTOMTIME_EVALUATION = "xBankBass/Request/Evaluation";
    public static final String XPATH_REQUEST_CUSTOMTIME_EVALUATIONTYPE = "xBankBass/Request/EvaluationType";
    public static final String XPATH_REQUEST_IDCARD = "xBankBass/Request/IdCard";
    public static final String XPATH_REQUEST_PAN = "xBankBass/Request/Pan";
    public static final String XPATH_REQUEST_TRANSLOGWITHDRAWID = "xBankBass/Request/TransLogWithdrawId";
    public static final String XPATH_REQUEST_QTMOPERATOR =  "xBankBass/Request/QtmOperator";
    public static final String XPATH_REQUEST_QTMOPERATORMESSAGE =  "xBankBass/Request/QtmOperatorMessage";
 
    public static final String CURRENCY_TYPE_CNY = "CNY";
    
  //xuchunfeng 
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TELLERBUSINESSNUM = "xBankBass/Request/SystemCheckAccount/TellerBusinessNum";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TRANSACCOUNT = "xBankBass/Request/SystemCheckAccount/TransAccount";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TRANSDATE= "xBankBass/Request/SystemCheckAccount/TransDate";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_OPERATETYPE= "xBankBass/Request/SystemCheckAccount/OperateType";
    public static final String XPATH_REQUEST_SYSTEMCHECKACCOUNT_TELLERNUM= "xBankBass/Request/SystemCheckAccount/TellerNum";
    public static final String XPATH_REQUEST_QTTYPE = "xBankBass/Request/QtType";

  //推荐广告的日期
    public static final String XPATH_REQUEST_RECOMMENDAD_DATETIME= "xBankBass/Request/RecommendAd/DateTime";
    //终端流水上传服务器
    public static final String XPATH_REQUEST_TRACELOGSERVE_TELLERNUM= "xBankBass/Request/TraceLogServer/TellerNum";
    public static final String XPATH_REQUEST_TRACELOGSERVE_BASE64DATA= "xBankBass/Request/TraceLogServer/Base64Data";
    public static final String XPATH_REQUEST_TRACELOGSERVE_SUBBRANCHNUM= "xBankBass/Request/TraceLogServer/SubBranchNum";
    public static final String XPATH_REQUEST_TRACELOGSERVE_DATE = "xBankBass/Request/TraceLogServer/Date";
    public static final String XPATH_REQUEST_TRACELOGSERVE_TERMNUM = "xBankBass/Request/TraceLogServer/TermNum";
    public static final String XPATH_REQUEST_BUSINESSWATERNUM = "xBankBass/Request/BusinessWaterNum";
    // response
    public static final String XPATH_RESPONSE = "xBankBass/Response";
    public static final String XPATH_RESPONSE_RETCODE = "xBankBass/Response/RetCode";
    public static final String XPATH_RESPONSE_TERMNUM = "xBankBass/Response/TermNum";
    public static final String XPATH_RESPONSE_BRANCHNUM = "xBankBass/Response/BranchNum";
    public static final String XPATH_RESPONSE_SUBBRANCHNUM = "xBankBass/Response/SubBranchNum";
    public static final String XPATH_RESPONSE_PARENTADDR = "xBankBass/Response/ParentAddr";
    public static final String XPATH_RESPONSE_TELLERNUM = "xBankBass/Response/TellerNum";
    public static final String XPATH_RESPONSE_TERMTYPE = "xBankBass/Response/TermType";
    public static final String XPATH_RESPONSE_TERMSTATUS = "xBankBass/Response/TermStatus";
    public static final String XPATH_RESPONSE_UISTYLE = "xBankBass/Response/UiStyle";
    public static final String XPATH_RESPONSE_UIMENUSTYLE = "xBankBass/Response/UiMenuStyle";
    public static final String XPATH_RESPONSE_PINKEY = "xBankBass/Response/PinKey";
    public static final String XPATH_RESPONSE_PINVALIDATEKEY = "xBankBass/Response/PinValidateKey";
    public static final String XPATH_RESPONSE_MACKEY = "xBankBass/Response/MacKey";
    public static final String XPATH_RESPONSE_MASTERKEY = "xBankBass/Response/MasterKey";
    public static final String XPATH_RESPONSE_SECURITYMODULE = "xBankBass/Response/SecurityModule";
    public static final String XPATH_RESPONSE_ORIGINALMASTERKEY = "xBankBass/Response/OriginalMasterKey";
    public static final String XPATH_RESPONSE_MASTERKEYUPDATESTATE = "xBankBass/Response/MasterKeyUpdateState";
    public static final String XPATH_RESPONSE_PARENTID = "xBankBass/Response/ParentId";
    public static final String XPATH_RESPONSE_ASSIGNTELLER = "xBankBass/Response/AssignTeller";
    public static final String XPATH_RESPONSE_LISTENPORT = "xBankBass/Response/ListenPort";
    public static final String XPATH_RESPONSE_VMODULE = "xBankBass/Response/vModule";
    public static final String XPATH_RESPONSE_TRANSLOGWITHDRAWID = "xBankBass/Response/TransLogWithdrawId";
    public static final String XPATH_RESPONSE_TRANSLOGDEPOSITID = "xBankBass/Response/TransLogDepositId";
    public static final String XPATH_RESPONSE_TERMTSN = "xBankBass/Response/TermTsn";
    public static final String XPATH_RESPONSE_TYPE = "xBankBass/Response/Type";
    public static final String XPATH_RESPONSE_ACCOUNTTYPE = "xBankBass/Response/AccountType";
    public static final String XPATH_RESPONSE_CUSTOMERNAME = "xBankBass/Response/CustomerName";
    public static final String XPATH_RESPONSE_REVERSE_STATUS = "xBankBass/Response/ReverseStatus";//冲正
    public static final String XPATH_RESPONSE_ISMASTERKEYUPDATE = "xBankBass/Response/IsMasterKeyUpdate";
    public static final String XPATH_RESPONSE_COREDATE = "xBankBass/Response/CoreDate";
    public static final String XPATH_RESPONSE_COREWATERNUM = "xBankBass/Response/CoreWaterNum";
    public static final String XPATH_RESPONSE_ADDCASHSTATUS = "xBankBass/Response/addcashstatus";
    //根据返回状态判断是主机对账还是本地对账 add by buxishuan 2012-7-2
    public static final String XPATH_RESPONSE_CHECKACCOUNT_STATUS = "xBankBass/Response/CheckAccount/Status";
    //如果是主机对账，判断账务是否持平
    public static final String XPATH_RESPONSE_CHECKACCOUNT_RESULT = "xBankBass/Response/CheckAccount/Result";
    // Add for CITIC 交换密钥结果
    public static final String XPATH_RESPONSE_IRET = "xBankBass/Response/IRet";
    //返回交易流水号
    public static final String XPATH_RESPONSE_TRANSACTIONTSN = "xBankBass/Response/TransactionTsn";

    public static final String XPATH_RESPONSE_ACCOUNTS = "xBankBass/Response/Accounts";
    public static final String XPATH_RESPONSE_ACCOUNTS_VALUE = "xBankBass/Response/Accounts/Value";
    public static final String XPATH_RESPONSE_ACCOUNTS_CURRENCY = "xBankBass/Response/Accounts/Currency";
    public static final String XPATH_RESPONSE_ACCOUNTS_OUT = "xBankBass/Response/Accounts/Out";
    public static final String XPATH_RESPONSE_ACCOUNTS_IN = "xBankBass/Response/Accounts/In";
    
    public static final String XPATH_RESPONSE_RECORDS_RECORD_VALUE = "Value";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_TOTALAMOUNT = "TotalAmount";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_DINAMOUNT = "Dinamount";
    public static final String XPATH_RESPONSE_RECORDS_RECORD_WORKDATE = "Workdate";
    
    public static final String XPATH_RESPONSE_TOTALNUM = "xBankBass/Response/TotalNum";
	public static final String XPATH_RESPONSE_CT100 = "xBankBass/Response/ct100";
    public static final String XPATH_RESPONSE_CT50 = "xBankBass/Response/ct50";
    public static final String XPATH_RESPONSE_CT10 = "xBankBass/Response/ct10";
    public static final String XPATH_RESPONSE_ADDAMOUNT = "xBankBass/Response/addAmount";
    public static final String XPATH_RESPONSE_TXFAMOUNT = "xBankBass/Response/txfAmount";
    
    public static final String XPATH_REQUEST_EXPHANDLE = "xBankBass/Request/ExpHandle";
    public static final String XPATH_REQUEST_AUTHORIZATION = "xBankBass/Request/Authorization";
    public static final String XPATH_REQUEST_AUTHORIZATION_TYPE = "xBankBass/Request/Authorization/Type";
    public static final String XPATH_REQUEST_AUTHORIZATION_TRANSACTION = "xBankBass/Request/Authorization/TransAction";
    public static final String XPATH_REQUEST_AUTHORIZATION_RESULT = "xBankBass/Request/Authorization/Result";
    public static final String XPATH_REQUEST_AUTHORIZATION_TERMNUM = "xBankBass/Request/Authorization/TermNum";
    public static final String XPATH_REQUEST_TASKID ="xBankBass/Request/TaskId";
    public static final String XPATH_REQUEST_AUTHORIZATION_TASKID = "xBankBass/Request/Authorization/TaskId";
    public static final String XPATH_REQUEST_AUTHORIZATION_TELLERNUM = "xBankBass/Request/Authorization/TellerNum";
    public static final String XPATH_REQUEST_AUTHORIZATION_CASENUM = "xBankBass/Request/Authorization/CaseNum";
    public static final String XPATH_REQUEST_AUTHORIZATION_CURRENCY = "xBankBass/Request/Authorization/Currency";
    public static final String XPATH_REQUEST_AUTHORIZATION_AMOUNT = "xBankBass/Request/Authorization/Amount";
    public static final String XPATH_REQUEST_AUTHORIZATION_FLAG = "xBankBass/Request/Authorization/Flag";
    public static final String XPATH_REQUEST_AUTHORIZATION_MEMO = "xBankBass/Request/Authorization/Memo";
    public static final String XPATH_REQUEST_AUTHORIZATION_REASON = "xBankBass/Request/Authorization/Reason";
    //增加50 100 面额数量
    public static final String XPATH_REQUEST_Denomination_50 = "xBankBass/Request/Denomination_50";
    public static final String XPATH_REQUEST_Denomination_100 = "xBankBass/Request/Denomination_100";
    public static final String XPATH_REQUEST_Denomination_10 = "xBankBass/Request/Denomination_10";
    
    // 凭条打印新增节点
    public static final String XPATH_RESPONSE_ANSNO = "xBankBass/Response/AnsNo";// 完成码
    public static final String XPATH_RESPONSE_SEARCHNO = "xBankBass/Response/SearchNo";// 检索码
    public static final String XPATH_RESPONSE_ACQUIRERNO = "xBankBass/Response/AcquirerNo";// 代理行号
    public static final String XPATH_RESPONSE_REQDATE = "xBankBass/Response/strReqDate";// 请求报文的时间
    
    public static final String XPATH_RESPONSE_PARENTIDID = "xBankBass/Response/ParentIdId";//柜员令牌
//xuchunfeng
    public static final String XPATH_RESPONSE_SYSTEMCHECKACCOUNT_RETURNSTATE = "xBankBass/Response/SystemCheckAccount/ReturnState";
    public static final String XPATH_RESPONSE_SYSTEMCHECKACCOUNT_SYSTEMTRANSACCOUNT = "xBankBass/Response/SystemCheckAccount/SystemTransAccount";
    
    public static final String XPATH_RESPONSE_TRANSINSTITUTIONNAME =  "xBankBass/Response/TransInstitutionName";
    public static final String XPATH_REQUEST_TRANSINSTITUTIONNUM = "xBankBass/Request/TransInstitutionNum";
    
    /**
     * forwordaction中填充的xml字段名，用于服务器跳转页面时将数据保存到HttpRequest的指定属性中
     */
    public static final String FORWARDACTION_REQUEST_XMLTEXT = "xmltext";

    /**
     * 短信提醒
     */
    // request
    public static final String XPATH_REQUEST_PHONENUM = "xBankBass/Request/PhoneNum";
    public static final String XPATH_REQUEST_MINWAITNUM = "xBankBass/Request/MinWaitNum";

    /**
     * 预处理结果
     */
    // response
    public static final String XPATH_RESPONSE_QUEUENUM = "xBankBass/Response/QueueNum";
    public static final String XPATH_RESPONSE_PROMPTINFO = "xBankBass/Response/PromptInfo";
    
    public static final String XPATH_RESPONSE_BUTTON = "xBankBass/Response/Button";
    public static final String XPATH_RESPONSE_BUTTON_NAME = "Name";
    public static final String XPATH_RESPONSE_BUTTON_NAMEEN = "NameEn";
    public static final String XPATH_RESPONSE_BUTTON_SERVICE_NAME = "ServiceName";
    public static final String XPATH_RESPONSE_BUTTON_POSITION = "ButtonPosition";

    /**
     * 记录集结果
     */
    // response
    public static final String XPATH_RESPONSE_RECORDS = "xBankBass/Response/Records";
    public static final String XPATH_RESPONSE_RECORD = "xBankBass/Response/Records/Record";
    public static final String XPATH_RESPONSE_RECORDRESULT_THS = "xBankBass/Response/RecordResult/ths";
    public static final String XPATH_RESPONSE_RECORDRESULT_THSEN = "xBankBass/Response/RecordResult/thsEN";
    public static final String XPATH_RESPONSE_RECORDRESULT_FIELDNAMES = "xBankBass/Response/RecordResult/FieldNames";
    public static final String XPATH_RESPONSE_RECORDRESULT = "xBankBass/Response/RecordResult";
    public static final String XPATH_RESPONSE_RECORDRESULT_RECORDS_RECORD = "xBankBass/Response/RecordResult/Records/Record";
    public static final String XPATH_RESPONSE_RECORDRESULT_ENABLE = "xBankBass/Response/RecordResult/Enable";
    public static final String XPATH_RESPONSE_RECORDRESULT_SERVICENAME = "xBankBass/Response/RecordResult/ServiceName";
    public static final String XPATH_RESPONSE_RECORDRESULT_RETURN = "xBankBass/Response/RecordResult/Return";

    /**
     * 菜单服务
     */
    // request
    public static final String XPATH_REQUEST_PARENTMENUID = "xBankBass/Request/ParentMenuId";
    //针对柜员端UI改造修改
    public static final String XPATH_REQUEST_MENULEVEL = "xBankBass/Request/MenuLevel";
    //服务名称
    public static final String XPATH_REQUEST_TRANSNAME = "xBankBass/Request/TransName";
    
    // response
    public static final int SHORTCUTMENU = 1;
    public static final int NOTSHORTCUTMENU = 0;
    public static final String XPATH_RESPONSE_MAINMENU = "xBankBass/Response/MainMenu";
    public static final String XPATH_RESPONSE_MENU = "xBankBass/Response/Menu";
    public static final String XPATH_RESPONSE_MENU_ID = "Id";
    public static final String XPATH_RESPONSE_MENU_MENUID = "MenuId";
    public static final String XPATH_RESPONSE_MENU_NAME = "Name";
    public static final String XPATH_RESPONSE_MENU_NOTE = "Note";
    public static final String XPATH_RESPONSE_MENU_NAMEEN = "NameEn";
    public static final String XPATH_RESPONSE_MENU_URL = "Url";
    public static final String XPATH_RESPONSE_MENU_TRANSID = "TransId";
    public static final String XPATH_RESPONSE_MENU_TRANSNAME = "TransName";
    public static final String XPATH_RESPONSE_MENU_SERVICENAME = "ServiceName";
    public static final String XPATH_RESPONSE_MENU_PARENTMENUID = "ParentMenuId";
    public static final String XPATH_RESPONSE_MENU_TRANSIMG = "TransImg";
    public static final String XPATH_RESPONSE_MENU_MULTIAPPSELECT = "MultiAppSelect";
    public static final String XPATH_RESPONSE_MENU_IMGPOSITION = "ImgPosition";
    public static final String XPATH_RESPONSE_MENU_MENUUSESTATUS = "MenuUseStatus";
    //添加按钮服务名称(用于济南中信区分转账 和 信用卡还款记录日志) add by ouwanjun 2011-12-30 
    public static final String TRANSACCOUNT = "transAccount";//转账
    public static final String CREDITCARDPAY = "creditcardpay";//信用卡转账还款

    public static final String XPATH_RESPONSE_RECOMMENDMENU_RECOMMENDTRANSNAME = "RecommendTransName";//推荐交易名称
    public static final String XPATH_RESPONSE_RECOMMENDMENU = "xBankBass/Response/RecommendMenu";//推荐交易菜单
    public static final String XPATH_RESPONSE_RECOMMENDMENU_MENU = "Menu";
    
    public static final String XPATH_RESPONSE_RECOMMENDAD_IMAGEURL = "xBankBass/Response/RecommendAd/ImageUrl";//推荐广告的路径
    
    /**
     * 支行服务
     */
    public static final String XPATH_RESPONSE_SUBBRANCH = "xBankBass/Response/SubBranch";
    public static final String XPATH_RESPONSE_SUBBRANCH_NUM = "Number";
    public static final String XPATH_RESPONSE_SUBBRANCH_NAME_ = "Name";
    
    /**
     * 交易服务
     */
    // request
    public static final String XPATH_REQUEST_TRANS_ID = "xBankBass/Request/Trans/TransId";
    public static final String XPATH_REQUEST_TRANS_NAME = "xBankBass/Request/Trans/TransName";
    public static final String XPATH_REQUEST_TRANSINFO_ID = "xBankBass/Request/TransInfo/Id";

    // response
    public static final String XPATH_RESPONSE_TRANSINFO = "xBankBass/Response/TransInfo";
    public static final String XPATH_RESPONSE_TRANSINFO_ID = "xBankBass/Response/TransInfo/Id";
    public static final String XPATH_RESPONSE_TRANS_ID = "xBankBass/Response/Trans/Id";
//    public static final String XPATH_RESPONSE_TRANS_NAME = "xBankBass/Response/TransName";
    public static final String XPATH_RESPONSE_TRANS_DETAILITEMS = "DetailItems";

    /**
     * 队列服务
     */
    // request
    public static final String XPATH_REQUEST_SUBBRANCHNUM = "xBankBass/Request/SubBranchNum";
    public static final String XPATH_REQUEST_QUEUE_ID = "xBankBass/Request/QueueId";
    public static final String XPATH_REQUEST_QUEUE_TYPE = "xBankBass/Request/QueueType";
    public static final String XPATH_REQUEST_QUEUEITEM_ID = "xBankBass/Request/QueueItemId";
    public static final String XPATH_REQUEST_QUEUEITEM_NUM = "xBankBass/Request/QueueItemNum";
    public static final String XPATH_RESPONSE_PRINTINFO = "xBankBass/Response/PrintInfo";

    // response
    public static final String XPATH_RESPONSE_QUEUE = "xBankBass/Response/Queue";
    public static final String XPATH_RESPONSE_QUEUE_ID = "Id";
    public static final String XPATH_RESPONSE_QUEUE_NAME = "Name";
    public static final String XPATH_RESPONSE_QUEUE_Number = "Number";
    public static final String XPATH_RESPONSE_QUEUEITEM_ID = "QueueItemId";
    public static final String XPATH_RESPONSE_QUEUEITEM_NUM = "QueueItemNum";

    public static final String XPATH_RESPONSE_SUBBRANCH_NAME = "xBankBass/Response/SubBranchName";
    public static final String XPATH_RESPONSE_QUEUE_AMOUNTOFPEOPLEINWAITING = "xBankBass/Response/AmountOfPeopleInWaiting";
    public static final String XPATH_RESPONSE_QUEUE_AMOUNTOFTIMEINWAITING = "xBankBass/Response/AmountOfTimeInWaiting";
    
    public static final String XPATH_RESPONSE_QUEUENAME = "xBankBass/Response/QueueName";
    public static final String XPATH_RESPONSE_QUEUEITEMNUM = "xBankBass/Response/QueueItemNum";
    public static final String XPATH_RESPONSE_AMOUNTOFPEOPLEINWAITING = "xBankBass/Response/AmountOfPeopleInWaiting";
    public static final String XPATH_RESPONSE_AMOUNTOFTIMEINWAITING = "xBankBass/Response/AmountOfTimeInWaiting";
    


    public static final String MSG_TRANS_NAME = "您选择的交易：";
    public static final String MSG_AMOUNTOFPEOPLEINWAITING = "您需要等待的人数：";
    public static final String MSG_AMOUNTOFTIMEINWAITING = "您需要等待的时间：";
    public static final String MSG_QUEUEITEM_NOT_FOUND = "系统未找到您之前的排队号，请确认您的排队号输入正确";
    public static final String MSG_RESTORE_QUEUING = "请您留意公告牌叫号信息，不要再次错过叫号";

    //清点
    public static final String XPATH_RESPONSE_DEPOSITNUM = "xBankBass/Response/DepositNum";
    public static final String XPATH_RESPONSE_DEPOSITACCOUNT = "xBankBass/Response/DepositAccount";
    public static final String XPATH_RESPONSE_WITHDRAWNUM = "xBankBass/Response/WithdrawNum";
    public static final String XPATH_RESPONSE_WITHDRAWACCOUNT = "xBankBass/Response/WithdrawAccout";
    public static final String XPATH_REQUEST_SHOWINVENTORY_TELLERNUM = "xBankBass/Request/ShowInventory/TellerNum";
    public static final String XPATH_REQUEST_SHOWINVENTORY_DATETIME = "xBankBass/Request/ShowInventory/datetime";
    public static final String XPATH_REQUEST_SHOWINVENTORY_TERMNUM = "xBankBass/Request/ShowInventory/TermNum";
    public static final String XPATH_REQUEST_SHOWINVENTORY = "xBankBass/Request/ShowInventory";
    /**
     * 预约服务
     */
    // request 
    public static final String XPATH_REQUEST_RESERVE_TYPE = "xBankBass/Request/ReserveType";
    public static final String XPATH_REQUEST_RESERVE_TIME = "xBankBass/Request/ReserveTime";
    public static final String XPATH_REQUEST_RESERVATION_NUM = "xBankBass/Request/ReservationNum";
    
    // response
    public static final String XPATH_RESPONSE_RESERVATION_NUM = "xBankBass/Response/Reservation/Num";
    public static final String XPATH_RESPONSE_RESERVATION_STARTTIME = "xBankBass/Response/Reservation/StratTime";
    public static final String XPATH_RESPONSE_RESERVATION_EXPIRETIME = "xBankBass/Response/Reservation/ExpireTime";
    public static final String MSG_RESERVATION_NUM = "您的预约号是：";
    public static final String MSG_RESERVATION_STARTTIME = "您的预约有效期开始时间：";
    public static final String MSG_RESERVATION_EXPIRETIME = "您的预约有效期过期时间：";
    public static final String MSG_RESERVATION_NOT_FOUND = "请检查您的预约号输入是否正确";
    public static final String MSG_BEFORE_VALID_PERIOD = "还未到您的预约办理时间";
    public static final String MSG_AFTER_VALID_PERIOD = "您的预约已过期";
    public static final String MSG_RESERVATION_ALREADY_ACTIVATED = "您的预约已经被激活";
    
    // 柜员服务 
    public static final String  XPATH_REQUEST_FINGERDATA =  "xBankBass/Request/FingerData";
    public static final String  XPATH_REQUEST_TRANSACTIONPWD =  "xBankBass/Request/TransactionPwd";
    public static final String XPATH_REQUEST_TELLER_NUM = "xBankBass/Request/TellerNum";
    
    public static final String XPATH_REQUEST_DEVICETYPE = "xBankBass/Request/DeviceType";
    public static final String XPATH_RESPONSE_THRESHOLDWARNADDORDELETE = "xBankBass/Response/ThresholdWarnAddOrDelete";//0增加、1删除
    public static final String XPATH_REQUEST_THRESHOLDWARNMESSAGE = "xBankBass/Request/thresholdWarnMessage";
    public static final String  XPATH_REQUEST_STRQUICKCOUNTER = "xBankBass/Request/strQuickCounter";
    public static final String  XPATH_RESPONSE_STRQUICKCOUNTER = "xBankBass/Response/strQuickCounter";
    public static final String XPATH_REQUEST_THRESHOLDWARNTYPE = "xBankBass/Request/thresholdWarnType";
    public static final String XPATH_REQUEST_TELLERDEPOSITITYPEID = "xBankBass/Request/TellerDepositItypeId";
    public static final String XPATH_REQUEST_TELLERTHRESHOLDDEPOSITNUM = "xBankBass/Request/TellerThresholdDepositNum";
    public static final String XPATH_REQUEST_TELLERWITHDRAWITYPEID = "xBankBass/Request/TellerWithDrawItypeId";
    public static final String XPATH_REQUEST_TELLERTHRESHOLDWITHDRAWNUM = "xBankBass/Request/TellerThresholdWithDrawNum";
    public static final String XPATH_REQUEST_QTMDEPOSITITYPEID = "xBankBass/Request/QTMWithDepositItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDDEPOSITNUM = "xBankBass/Request/QTMThresholdDepositNum";
    public static final String XPATH_REQUEST_QTMWITHDRAWITYPEID = "xBankBass/Request/QTMWithDrawItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDWITHDRAWNUM = "xBankBass/Request/QTMThresholdWithDrawNum";
    public static final String XPATH_REQUEST_QTMWITHDRAWWARNITYPEID = "xBankBass/Request/QTMWithDrawWarnItypeId";
    public static final String XPATH_REQUEST_QTMTHRESHOLDWITHDRAWWARNNUM = "xBankBass/Request/QTMThresholdWithDrawWarnNum";
    public static final String XPATH_REQUEST_JUDGETYPE = "xBankBass/Request/JudgeType";
    public static final String XPATH_REQUEST_ISERVICESSTATUS = "xBankBass/Request/Iservicesstatus";
    public static final String XPATH_REQUEST_IFRONTSTATUS = "xBankBass/Request/Ifrontstatus";
    public static final String XPATH_REQUEST_EXCEPTIONID = "xBankBass/Request/ExceptionId";
    public static final String XPATH_REQUEST_STRSNLOGID = "xBankBass/Request/Strsnlogid";
    public static final String XPATH_RESPONSE_CASHDRAWERMONEY = "xBankBass/Response/CashDrawerMoney";
    public static final String XPATH_RESPONSE_TELLERTHRESHOLDDEPOSITNUM = "xBankBass/Response/TellerThresholdDepositNum";
    public static final String XPATH_RESPONSE_TELLERTHRESHOLDWITHDRAWNUM = "xBankBass/Response/TellerThresholdWithDrawNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDDEPOSITNUM = "xBankBass/Response/QTMThresholdDepositNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDWITHDRAWNUM = "xBankBass/Response/QTMThresholdWithDrawNum";
    public static final String XPATH_RESPONSE_QTMTHRESHOLDWITHDRAWWARNNUM = "xBankBass/Response/QTMThresholdWithDrawWarnNum";
    public static final String XPATH_REQUEST_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_NEWPASSWORD = "xBankBass/Request/NewPassword";
    public static final String XPATH_REQUEST_TELLER_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_OPERATOR_NUM = "xBankBass/Request/OperatorNum";
    public static final String XPATH_REQUEST_OPERATOR_PASSWORD = "xBankBass/Request/Password";
    public static final String XPATH_REQUEST_TELLER_STATUS = "xBankBass/Request/TellerStatus";
    public static final String XPATH_RESPONSE_LOGIN_STATUS = "xBankBass/Response/LoginStatus";
    public static final String XPATH_RESPONSE_LOGIN_FAILMSG = "xBankBass/Response/FailMsg";
    public static final String MSG_LOGIN_FAIL = "柜员号或密码错误";
    public static final String XPATH_RESPONSE_LOGIN_TELLERNUM = "xBankBass/Response/TellerNum";
    public static final String XPATH_RESPONSE_LOGIN_TELLERNAME = "xBankBass/Response/TellerName";
    public static final String XPATH_RESPONSE_LOGIN_BRANCHNAME = "xBankBass/Response/BranchName";
    public static final String XPATH_RESPONSE_LOGIN_SUBBRANCHNAME = "xBankBass/Response/SubBranchName";
    public static final String XPATH_RESPONSE_LOGIN_LOGINCOUNT = "xBankBass/Response/LoginCount";
    public static final String XPATH_RESPONSE_LOGIN_LOGINSTATUS = "xBankBass/Response/LoginStatus";
    public static final String XPATH_RESPONSE_LOGIN_LOGINTIME = "xBankBass/Response/LoginTime";
    public static final String XPATH_RESPONSE_CHCEKACCOUNT_AMOUNT = "xBankBass/Response/CheckAccountAmount";
    public static final String XPATH_RESPONSE_CHCEKACCOUNT_STATUS = "xBankBass/Response/CheckAccountStatus";
    public static final String XPATH_REQUEST_OLDPASSWORD = "xBankBass/Request/OldPassword";
    public static final String XPATH_REQUEST_NEWPASSWORDCMD = "xBankBass/Request/NewPasswordCmd";
    public static final String XPATH_REQUEST_CHECKACCOUNTTYPE = "xBankBass/Request/CheckAccountType";
    public static final String XPATH_REQUEST_ACCOUNTTYPE = "xBankBass/Request/AccountType";
    public static final String XPATH_REQUEST_INACCOUNTTYPE = "xBankBass/Request/InAccountType";//转入卡号类型
    public static final String XPATH_REQUEST_CHECKACCOUNT_TOTAL = "xBankBass/Request/CheckTotalAccount";//扎帐总金额
    public static final String XPATH_REQUEST_FIELD23 = "xBankBass/Request/Field23";
    public static final String XPATH_REQUEST_FIELD55 = "xBankBass/Request/Field55";
    public static final String XPATH_REQUEST_ISINPUTACCOUNT = "xBankBass/Request/IsInputAccount";
    public static final String XPATH_REQUEST_REVERSETSN = "xBankBass/Request/ReverseTsn";
    public static final String XPATH_REQUEST_REVERSEDATE = "xBankBass/Request/ReverseDate";
    public static final String XPATH_REQUEST_TRANSCODE = "xBankBass/Request/TransCode";
    public static final String XPATH_REQUEST_REVERSETYPE = "xBankBass/Request/ReverseType";
    public static final String XPATH_REQUEST_CHECKTERMSERIALNUM = "xBankBass/Request/CheckTermSerialNum";
    public static final String XPATH_REQUEST_QTDATE = "xBankBass/Request/QtDate";
    
    // 柜员密码上次修改时间
    public static final String XPATH_RESPONSE_USINGDAY = "xBankBass/Response/UsingDay";

    // 操作员服务
    public static final String MSG_HELP_RESPONSE = "请稍候，工作人员会马上为您提供帮助";

    // 窗口服务
    public static final String XPATH_REQUEST_WINDOW_SCORE = "xBankBass/Request/Score";
    public static final String XPATH_RESPONSE_WINDOW_NODE = "xBankBass/Response/Window";
    public static final String XPATH_RESPONSE_WINDOW_NAME = "xBankBass/Response/WindowName";
    public static final String XPATH_RESPONSE_WINDOW_ID = "WindowId";
    public static final String XPATH_RESPONSE_WINDOWS_NAME = "WindowName";
    public static final String XPATH_RESPONSE_WINDOW_QUEUEID = "QueueId";
    
    //客户敏感评价服务
    public static final String XPATH_RESPONSE_EVALUATION_NODE ="xBankBass/Response/Evaluation";
    public static final String XPATH_RESPONSE_EVALUATION_ID ="Id";
    public static final String XPATH_RESPONSE_EVALUATION_DATETIME = "datetime";
    public static final String XPATH_RESPONSE_EVALUATION_WINDOW = "window";
    public static final String XPATH_RESPONSE_EVALUATION_TELLER = "teller";
    public static final String XPATH_RESPONSE_EVALUATION_SUBBRANCH = "SubBranch";
    public static final String XPATH_REQUEST_EVALUATION_ID ="xBankBass/Request/Evaluation/Id";
    
    //客户敏感评价服务
    public static final String XPATH_RESPONSE_TELLER_NODE ="xBankBass/Response/Teller";
    public static final String XPATH_RESPONSE_TELLER_ID ="Id";
    public static final String XPATH_RESPONSE_TELLER_NAME ="Name";
    
    // Socket消息通知服务
    public static final String XPATH_REQUEST_SOCKETMSG_ID = "xBankBass/Request/SocketMsgId";
    public static final String XPATH_REQUEST_SOCKETMSG_CATEGORY = "xBankBass/Request/Category";
    public static final String XPATH_RESPONSE_SOCKETMSG = "xBankBass/Response/SocketMsg";
    public static final String XPATH_RESPONSE_SOCKETMSG_ID = "Id";
    public static final String XPATH_RESPONSE_SOCKETMSG_CONTENT = "Content";
    public static final String XPATH_RESPONSE_SOCKETMSG_TIME = "Time";
    public static final String XPATH_RESPONSE_SOCKETMSG_STATUS = "Status";
    
    //自动柜员终端服务
    public static final String XPATH_RESPONSE_TELLERCASHERTERMS = "xBankBass/Response/TellerCasherTerms";
    public static final String XPATH_RESPONSE_TELLERCASHERTERMSTATUS = "xBankBass/Response/TellerCasherTermStatus";
    public static final String XPATH_RESPONSE_DEVICESTATUS = "xBankBass/Response/DeviceStatus";
    public static final String XPATH_RESPONSE_DEVICEALARM = "xBankBass/Response/DeviceAlarm";
    public static final String XPATH_RESPONSE_CASSUNITINFO_RECORDS = "xBankBass/Response/CassUnitInfo/Records";
    public static final String XPATH_RESPONSE_TELLERCASHER_TERMNUM = "TermNum";
    public static final String XPATH_RESPONSE_TELLERCASHER_NETADDR = "NetAddress";
    public static final String XPATH_RESPONSE_TELLERCASHER_POSITION = "Position";
    public static final String XPATH_RESPONSE_SVCSTATUS = "xBankBass/Response/SvcStatus";
    public static final String XPATH_RESPONSE_TELLERCASHER_STATUS = "Status";
    public static final String XPATH_RESPONSE_TELLERCASHER_ERRORINFO = "ErrorInfo";
    public static final String XPATH_TELLERCASHRECORD = "xBankBass/TellerCashRecord";
    public static final String XPATH_REQUEST_TELLERNOTES_TASKID = "xBankBass/Request/TellerNotes/TaskId";
    public static final String XPATH_REQUEST_TELLERNOTES_TERMNUM = "xBankBass/Request/TellerNotes/TermNum";
    public static final String XPATH_RESPONSE_TELLERNOTE = "xBankBass/Response/TellerNote";
    public static final String XPATH_RESPONSE_TELLERNOTE_CURRENCY = "Currency";
    public static final String XPATH_RESPONSE_TELLERNOTE_VALUE = "Value";
    public static final String XPATH_RESPONSE_TELLERNOTE_COUNT = "Count";
    public static final String XPATH_RESPONSE_TELLERNOTE_IN = "In";
    public static final String XPATH_RESPONSE_TELLERNOTE_OUT = "Out";
    public static final String XPATH_RESPONSE_COMPLETED = "xBankBass/Response/Completed";
    public static final String XPATH_RESPONSE_INCOMPLETED = "xBankBass/Response/Incompleted";
    public static final String XPATH_RESPONSE_TASK = "Task";
    public static final String XPATH_RESPONSE_TELLERNOTES_TYPE = "TellerNotes/Type";
    public static final String XPATH_RESPONSE_TELLERNOTES_TASKID = "TellerNotes/TaskId";
    public static final String XPATH_RESPONSE_TELLERNOTES_TERMNUM = "TellerNotes/TermNum";
    public static final String XPATH_RESPONSE_TELLERNOTES_AMOUNT = "TellerNotes/Amount";
    public static final String XPATH_RESPONSE_TELLERNOTES_DATETIME = "TellerNotes/DateTime";
    public static final String XPATH_RESPONSE_TELLERNOTES = "TellerNotes";
    public static final String XPATH_RESPONSE_TELLERNOTESTASKID = "xBankBass/Response/TellerNotesTaskId";
    public static final String MODULENAME_SVCSTATUS = "SvcStatus";
    public static final String MODULENAME_COMMSTATUS = "CommStatus";
    public static final String MODULENAME_CARDREADER = "CardReader";
    public static final String MODULENAME_PINPAD = "PinPad";
    public static final String MODULENAME_CASHACCEPTOR = "CashAcceptor";
    public static final String MODULENAME_CASHDISPENSER = "CashDispenser";
    public static final int TC_RECORD_COMPLETED = 1;            //任务已完成标志
    public static final int TC_RECORD_INCOMPLETED = 0;          //任务未完成标志
    public static final String TC_RECORD_MAXCOUNT = "30";       //任务返回缺省最大记录数
    public static final String XPATH_REQUEST_CASHDRAWER = "xBankBass/Request/CashDrawer";
    public static final String XPATH_REQUEST_CASHDRAWER_TERMNUM = "xBankBass/Request/CashDrawer/TermNum";
    public static final String XPATH_REQUEST_CASHDRAWER_NOTE = "xBankBass/Request/CashDrawer/Note";
    public static final String XPATH_RESPONSE_CASHDRAWER_NOTE = "xBankBass/Response/CashDrawer/Note";
    public static final String XPATH_RESPONSE_CASHDRAWER = "xBankBass/Response/CashDrawer";
    public static final String XPATH_RESPONSE_CASHDRAWER_TERMNUM = "TermNum";
    public static final String XPATH_RESPONSE_CASHDRAWER_SINGLE_NOTE = "Note";
    public static final String XPATH_RESPONSE_AD = "xBankBass/Response/Ad";
    public static final String XPATH_RESPONSE_AD_BRANCHID = "BranchId";
    public static final String XPATH_RESPONSE_AD_SUBBRANCHID = "SubBranchId";
    public static final String XPATH_RESPONSE_AD_TERMTYPE = "TermType";
    public static final String XPATH_RESPONSE_AD_CONDITION = "Contidion";
    public static final String XPATH_RESPONSE_AD_FILETYPE = "FileType";
    public static final String XPATH_RESPONSE_AD_FILEURL = "FileUrl";
    public static final String XPATH_RESPONSE_SERVERSTATUS = "xBankBass/Response/ServerStatus";
    public static final String XPATH_RESPONSE_QUEUEITEM_FOUND = "xBankBass/Response/QueueItemFound";
    public static final String XPATH_RESPONSE_CASHDRAWERTOTALMONEY = "xBankBass/Response/CashDrawerTotalMoney";
    public static final String XPATH_RESPONSE_CASSUNITTOTALMONEY = "xBankBass/Response/CassUnitTotalMoney";
    public static final String XPATH_RESPONSE_MODULENAME = "ModuleName";
    public static final String XPATH_RESPONSE_MODULESTATUS = "Status";
    public static final String XPATH_RESPONSE_ERRORINFO = "ErrorInfo";
    public static final String XPATH_RESPONSE_ALARMLEVEL = "AlarmLevel";
    public static final String XPATH_RESPONSE_CHECKTRANSACTIONSTATUS = "xBankBass/Response/CheckTransactionStatus";
    public static final String XPATH_RESPONSE_DTSTARTTIME = "xBankBass/Response/Dtstarttime";
    public static final String XPATH_RESPONSE_STRTSNUM = "xBankBass/Response/Strtsnum";
    public static final String XPATH_RESPONSE_STRTERMNUM = "xBankBass/Response/Strtermnum";
    public static final String XPATH_RESPONSE_IAMOUNT = "xBankBass/Response/Iamount";
    public static final String XPATH_RESPONSE_STRCURRENCYCODE = "xBankBass/Response/Strcurrencycode";
    public static final String XPATH_RESPONSE_STRTELLERNUM = "xBankBass/Response/Strtellernum";
    public static final String XPATH_RESPONSE_SERVICEMODE = "xBankBass/Response/servicemode";
    public static final String XPATH_RESPONSE_WINDOWNUM = "xBankBass/Response/windownum";
    
    // 有奖交易
    public static final String XPATH_REQUEST_BONUSCURID = "xBankBass/Request/BonusCurId";
    public static final String XPATH_REQUEST_MOBILENUM = "xBankBass/Request/MobileNum";
    
    /**
     * 自动更新
     */
    public static final String XPATH_REQUEST_SYSTEMNAME = "xBankBass/Request/SystemName";
    public static final String XPATH_REQUEST_CLIENTVERSION = "xBankBass/Request/ClientVersion";
    public static final String XPATH_RESPONSE_SYSTEMVERSION = "xBankBass/Response/SystemVersion";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_SYSTEMNAME = "SystemName";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_VERSION = "Version";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_VERSIONDESC = "VersionDesc";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_REBOOT = "Reboot";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER = "FtpServer";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_IP = "IP";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_PORT = "Port";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_USER = "User";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FTPSERVER_PASSWORD = "Password";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE = "File";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_CLIENTFILEFULLPATH = "ClientFileFullPath";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_SERVERFILEFULLPATH = "ServerFileFullPath";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_VERSION = "Version";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_MD5 = "Md5";
    public static final String XPATH_RESPONSE_SYSTEMVERSION_FILE_GROUP = "Group";
    
    //终端错误报告
    public static final String XPATH_REQUEST_ERRORINFO = "xBankBass/Request/ErrorInfo";
    public static final String XPATH_REQUEST_IMAGEFILENAME = "xBankBass/Request/ImageFileName";
    public static final String IMAGE_FILE_PATH = "/usr/hiaward/log/bass";
    public static final String IMAGE_FILE_NAME = "ErrorInfo.log";

    //货币种类
    public static final String CURRENCY_TYPE_RMB = "RMB";               //货币种类--人民币
    
    //PDA页面属性
    public static final int PDA_MAX_PAGE_RECORD = 6;                    //每页显示的最大记录数
    public static final String PDA_MSG_NOT_READ_COLOR = "red";          //未阅消息显示颜色
    public static final String PDA_MSG_READED_COLOR = "black";          //已阅消息显示颜色
    public static final String PDA_FONT_BLACK_COLOR = "#000";                //PDA按钮字体黑色常量
    public static final String PDA_FONT_GREY_COLOR = "#999";                 //PDA按钮字体灰色常量
    
    // 自动柜员出纳机告警级别
    public static String TELLERCASH_ALARM_HIGH = "0";
    public static String TELLERCASH_ALARM_NORMAL = "1";
    public static String TELLERCASH_ALARM_LOW = "2";
    
    // 自动柜员出纳机模块名与报警级别对应关系数组
    public static String ARRAY_VMODULE_ALARMLEVEL[][] = {
                                    new String[]{"SvcStatus","服务状态",TELLERCASH_ALARM_HIGH},
                                    new String[]{"CommStatus","通讯状态",TELLERCASH_ALARM_HIGH},
                                    new String[]{"CardReader","刷卡、折器",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"IDReader","二代身份证阅读器",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"PinPad","密码键盘",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashAcceptor","存款模块",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashDispenser","取款模块",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"Scanner","扫描仪",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"ReceiptPrinter","凭条打印机",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CredencePrinter","凭证打印机",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CashDrawer","零钱箱",TELLERCASH_ALARM_NORMAL},
                                    new String[]{"CassUnit","钞箱",TELLERCASH_ALARM_LOW}
                                    };
    // 终端设备状态标识数组
    public static String devStatus[][] = {
    	{"SVCSTATUS_IDLE","0"},							// 设备空闲
    	{"SVCSTATUS_OK","7"},							// 设备正常
    	{"SVCSTATUS_INSERVICE","1"},					// 客户交易中
    	{"SVCSTATUS_PAUSEBYDEV","2"},					// 硬件故障停止服务
    	{"SVCSTATUS_PAUSEBYMGR","3"},					// 管理命令停止服务
    	{"SVCSTATUS_INMAINTENANCE","4"},				// 管理员维护中
    	{"SVCSTATUS_POWEROFF","5"},						// 已关机
    	{"SVCSTATUS_PAUSEBYEXHAUST","6"},				// 耗材尽停止服务
    	{"SVCSTATUS_PAUSED","8"}						// 设备停用
    };


// 清机，汇总 笔数、金额
public static String XPATH_RESPONSE_VIEWCYCLE_SETTLECYCLE = "xBankBass/Response/ViewCycle/SettleCycle";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDSUCCESS_CNT = "xBankBass/Response/ViewCycle/CWDSuccess/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDSUCCESS_AMT = "xBankBass/Response/ViewCycle/CWDSuccess/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRA_CNT = "xBankBass/Response/ViewCycle/CWDExtra/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRA_AMT = "xBankBass/Response/ViewCycle/CWDExtra/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAIN_CNT = "xBankBass/Response/ViewCycle/CWDUncertain/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAIN_AMT = "xBankBass/Response/ViewCycle/CWDUncertain/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRADONE_CNT = "xBankBass/Response/ViewCycle/CWDExtraDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDEXTRADONE_AMT = "xBankBass/Response/ViewCycle/CWDExtraDone/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAINDONE_CNT = "xBankBass/Response/ViewCycle/CWDUncertainDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_CWDUNCERTAINDONE_AMT = "xBankBass/Response/ViewCycle/CWDUncertainDone/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPSUCCESS_CNT = "xBankBass/Response/ViewCycle/DEPSuccess/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPSUCCESS_AMT = "xBankBass/Response/ViewCycle/DEPSuccess/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAIN_CNT = "xBankBass/Response/ViewCycle/DEPUncertain/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAIN_AMT = "xBankBass/Response/ViewCycle/DEPUncertain/Amt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAINDONE_CNT = "xBankBass/Response/ViewCycle/DEPUncertainDone/Cnt";
public static String XPATH_RESPONSE_VIEWCYCLE_DEPUNCERTAINDONE_AMT = "xBankBass/Response/ViewCycle/DEPUncertainDone/Amt";

public static String XPATH_RESPONSE_SETTLECYCLE = "xBankBass/Response/SettleCycle";
//生成终端流水号
public static final String XPATH_RESPONSE_SCENARIOJOURNALNUM = "xBankBass/Response/ScenarioJournalNum"; 
public static final String XPATH_REQUEST_SCENARIOJOURNALNUM = "xBankBass/Request/ScenarioJournalNum"; 



// 2010-9-13 zhouhui ,长短款
public static final String XPATH_REQUEST_EXPHANDLE_CASENUM = "xBankBass/Request/ExpHandle/CaseNum";
public static final String XPATH_REQUEST_EXPHANDLE_AMOUNT = "xBankBass/Request/ExpHandle/Amount";
public static final String XPATH_REQUEST_EXPHANDLE_CURRENCY = "xBankBass/Request/ExpHandle/Currency";
public static final String XPATH_REQUEST_EXPHANDLE_FLAG = "xBankBass/Request/ExpHandle/Flag";
public static final String XPATH_REQUEST_EXPHANDLE_TYPE = "xBankBass/Request/ExpHandle/Type";
public static final String XPATH_REQUEST_EXPHANDLE_MEMO = "xBankBass/Request/ExpHandle/Memo";
public static final String XPATH_REQUEST_EXPHANDLE_ID = "xBankBass/Request/ExpHandle/Id";
public static final String XPATH_REQUEST_EXPHANDLE_TASKID = "xBankBass/Request/ExpHandle/TaskId";
public static final String XPATH_REQUEST_EXPHANDLE_TERMNUM = "xBankBass/Request/ExpHandle/TermNum";
    
//2010-9-14 zhouhui ,假币
public static final String XPATH_REQUEST_FORGEDNOTE = "xBankBass/Request/ForgedNote";
public static final String XPATH_REQUEST_FORGEDNOTE_CASENUM = "xBankBass/Request/ForgedNote/CaseNum";
public static final String XPATH_REQUEST_FORGEDNOTE_AMOUNT = "xBankBass/Request/ForgedNote/Amount";
public static final String XPATH_REQUEST_FORGEDNOTE_CURRENCY = "xBankBass/Request/ForgedNote/Currnecy";
public static final String XPATH_REQUEST_FORGEDNOTE_COUNT = "xBankBass/Request/ForgedNote/Count";
public static final String XPATH_REQUEST_FORGEDNOTE_TYPE = "xBankBass/Request/ForgedNote/Type";
public static final String XPATH_REQUEST_FORGEDNOTE_VERSION = "xBankBass/Request/ForgedNote/Version";
public static final String XPATH_REQUEST_FORGEDNOTE_NUMBER = "xBankBass/Request/ForgedNote/Number";
public static final String XPATH_REQUEST_FORGEDNOTE_OWNER = "xBankBass/Request/ForgedNote/Owner";
public static final String XPATH_REQUEST_FORGEDNOTE_METHOD = "xBankBass/Request/ForgedNote/Method";
public static final String XPATH_REQUEST_FORGEDNOTE_ID = "xBankBass/Request/ForgedNote/Id";
public static final String XPATH_REQUEST_FORGEDNOTE_STATUS = "xBankBass/Request/ForgedNote/Status";

//2010-9-14  ,尾箱
public static final String XPATH_REQUEST_TELLERCASE_TELLERNUM = "xBankBass/Request/TellerCase/TellerNum";
public static final String XPATH_REQUEST_TELLERCASE_PASSWORD = "xBankBass/Request/TellerCase/Password";
public static final String XPATH_REQUEST_TELLERCASE_BRANCHNUM = "xBankBass/Request/TellerCase/BranchNum";
public static final String XPATH_REQUEST_TELLERCASE_CASENUMBER = "xBankBass/Request/TellerCase/CaseNumber";

//2010-9-14  ,尾箱
public static final String XPATH_RESPONSE_TELLERCASE_STATUS=  "xBankBass/Response/TellerCase/Status";
//add by buxishuan 柜员尾箱编号
public static final String XPATH_RESPONSE_TELLERCASE_NUMBER=  "xBankBass/Response/TellerCase/Number";

public static final String XPATH_RESPONSE_TELLERCASEDETAIL_CASH = "xBankBass/Response/TellerCase/Cash";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_VOUCH= "xBankBass/Response/TellerCase/Vouch";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_IMPORTANCE= "xBankBass/Response/TellerCase/Importance";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_NAME = "name";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_COUNT = "count";
public static final String XPATH_RESPONSE_TELLERCASEDETAIL_LIMIT= "limit";

//柜员交接班  add caoyifeng
public static final String XPATH_REQUEST_SURRENDERTELLERNUM = "xBankBass/Request/ChangeTeller/tellerNum/out";
public static final String XPATH_REQUEST_CHANGETELLER_TELLERNUM = "xBankBass/MessageHead/TermNum";
public static final String XPATH_REQUEST_RECEIVERTELLERNUM = "xBankBass/Request/ChangeTeller/tellerNum/in";
public static final String XPATH_REQUEST_REMARKTEXT= "xBankBass/Request/ChangeTeller/remark";
public static final String XPATH_REQUEST_CHANGETELLER_TYPE = "xBankBass/Request/ChangeTeller/Type";
public static final String XPATH_REQUEST_CHANGETELLER_DATETIME = "xBankBass/Request/ChangeTeller/DateTime";
public static final String XPATH_REQUEST_CHANGETELLER_TASKID = "xBankBass/Request/ChangeTeller/TaskId";
public static final String XPATH_REQUEST_CHANGETELLER_REMARKTEXT2 = "xBankBass/Request/ChangeTeller/RemarkText2";
public static final String XPATH_REQUEST_CHANGETELLER = "xBankBass/Request/ChangeTeller";
public static final String XPATH_REQUEST_CHANGETELLER_TERMNUM = "xBankBass/Request/ChangeTeller/TermNum";
//add by xuchunfeng 柜员角色
public static final String XPATH_REQUEST_ROLEMANAGE_ID = "xBankBass/Request/RoleManage/ID";
public static final String XPATH_REQUEST_ROLEMANAGE_NUMBER = "xBankBass/Request/RoleManage/Number";
public static final String XPATH_REQUEST_ROLEMANAGE_NAME = "xBankBass/Request/RoleManage/Name";
public static final String XPATH_REQUEST_ROLEMANAGE_STARTTIME = "xBankBass/Request/RoleManage/Starttime";
public static final String XPATH_REQUEST_ROLEMANAGE_ENDTIME = "xBankBass/Request/RoleManage/Endtime";
public static final String XPATH_REQUEST_ROLEMANAGE_CREATER = "xBankBass/Request/RoleManage/Creater";
public static final String XPATH_REQUEST_ROLEMANAGE_CREATIONTIME = "xBankBass/Request/RoleManage/Creationtime";
public static final String XPATH_REQUEST_ROLEMANAGE_STATE = "xBankBass/Request/RoleManage/State";
public static final String XPATH_REQUEST_ROLEMANAGE_DESCRIPTION = "xBankBass/Request/RoleManage/Description";
public static final String XPATH_REQUEST_ROLEMANAGE_OPERATETYPE = "xBankBass/Request/RoleManage/OperateType";
public static final String XPATH_REQUEST_ROLEMANAGE_RETURNSTATE = "xBankBass/Request/RoleManage/ReturnState";


//add by xuchunfeng 柜员属性
public static final String XPATH_REQUEST_TELLER_ID = "xBankBass/Request/Teller/ID";
public static final String XPATH_REQUEST_TELLER_NUMBER = "xBankBass/Request/Teller/TellerNum";
public static final String XPATH_REQUEST_TELLER_NAME = "xBankBass/Request/Teller/TellerName";
public static final String XPATH_REQUEST_TELLER_BRANCHNUM = "xBankBass/Request/Teller/BranchNum";
public static final String XPATH_REQUEST_TELLER_SUBBRANCHNUM = "xBankBass/Request/Teller/SubBranchNum";
public static final String XPATH_REQUEST_TELLER_STRPASSWORD = "xBankBass/Request/Teller/PassWord";
public static final String XPATH_REQUEST_TELLER_DEPARTMENTNAME = "xBankBass/Request/Teller/DepartmentName";
public static final String XPATH_REQUEST_TELLER_TELEPHONE = "xBankBass/Request/Teller/Telephone";
public static final String XPATH_REQUEST_TELLER_EMAIL = "xBankBass/Request/Teller/Email";
public static final String XPATH_REQUEST_TELLER_LOGINSTATUS = "xBankBass/Request/Teller/LoginStatus";
public static final String XPATH_REQUEST_TELLER_LOGINCOUNT = "xBankBass/Request/Teller/LoginCount";
public static final String XPATH_REQUEST_TELLER_LOGINTIME = "xBankBass/Request/Teller/LoginTime";
public static final String XPATH_REQUEST_TELLER_TYPE = "xBankBass/Request/Teller/Type";
public static final String XPATH_REQUEST_TELLER_DTCHANGEPWD = "xBankBass/Request/Teller/DtChangePwd";
public static final String XPATH_REQUEST_TELLER_CHECKACCOUNTSTATUS = "xBankBass/Request/Teller/CheckAccountStatus";
public static final String XPATH_REQUEST_TELLER_OPERATETYPE = "xBankBass/Request/Teller/OperateType";
public static final String XPATH_REQUEST_TELLER_RETURNSTATE = "xBankBass/Request/Teller/ReturnState";
public static final String XPATH_REQUEST_TELLER_ROLENAMES = "xBankBass/Request/Teller/RoleNames";
//add by xuchunfeng 同步柜员信息
public static final String  XPATH_REQUEST_TELLERNAME="xBankBass/Request/TellerName";
public static final String  XPATH_REQUEST_TELLERNUMBER="xBankBass/Request/TellerNumber";
public static final String XPATH_REQUEST_BUSINESSWATER = "xBankBass/Request/BusinessWater";
//add by yanjifu 
public static final String  XPATH_REQUEST_TELLERSTATUS="xBankBass/Request/TellerStatus";
//2011-10-25 交易流水差 add by ouwanjun
public static final String XPATH_REQUEST_BUYTYPE = "xBankBass/Request/BuyType";
public static final String XPATH_REQUEST_DTOCCUR = "xBankBass/Request/DtocCur";
public static final String XPATH_REQUEST_ACCOUNTNUM = "xBankBass/Request/AccountNum";
public static final String XPATH_REQUEST_MONEYAMOUNT = "xBankBass/Request/MoneyAmount";


//2012-06-04 现金调缴  add by wwl
public static final String XPATH_REQUEST_CASHMIXPAY_TRADETYPE = "xBankBass/Request/bytype" ;
public static final String XPATH_REQUEST_CASHMIXPAY_OTHERSJGM = "xBankBass/Request/othersjgm" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DTOCCUR = "xBankBass/Request/dtoccur" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DOCTSTOCKET = "xBankBass/Request/doctStocket" ;
public static final String XPATH_REQUEST_CASHMIXPAY_CARDNUM = "xBankBass/Request/cardNum";
public static final String XPATH_REQUEST_CASHMIXPAY_IMTYPE = "xBankBass/Request/cardNum/imtype" ;
public static final String XPATH_REQUEST_CASHMIXPAY_ISPREAD = "xBankBass/Request/cardNum/ispread" ;
public static final String XPATH_REQUEST_CASHMIXPAY_IPARVEL = "xBankBass/Request/cardNum/iparvel" ;
public static final String XPATH_REQUEST_CASHMIXPAY_IRKAMOUNT = "xBankBass/Request/cardNum/irkamount" ;

public static final String XPATH_REQUEST_CASHMIXPAY_BYTYPE = "xBankBass/Request/cashmixpay/byType" ;
public static final String XPATH_REQUEST_CASHMIXPAY_OTHERSTELLER= "xBankBass/Request/cashmixpay/OthersTeller" ;
public static final String XPATH_REQUEST_CASHMIXPAY_DTOCCURS = "xBankBass/Request/cashmixpay/dtocCur" ;

//重空凭证管理
public static final String XPATH_REQUEST_VOUCHER_BYTYPE = "xBankBass/Request/bytype";
public static final String XPATH_REQUEST_VOUCHER_TEXTDATE = "xBankBass/Request/workdate";
public static final String XPATH_REQUEST_VOUCHER_TRANSTEL ="xBankBass/Request/strtranstel";
public static final String XPATH_REQUEST_VOUCHER_TELLER ="xBankBass/Request/teller";
public static final String XPATH_REQUEST_VOUCHER_INCTELLER ="xBankBass/Request/incteller";
public static final String XPATH_REQUEST_VOUCHER_STATUS = "xBankBass/Request/status";
public static final String XPATH_REQUEST_VOUCHER_BYTYPR = "";
public static final String XPATH_REQUEST_VOUCHER_VTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_VOUTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_CALBREAD = "";
public static final String XPATH_REQUEST_VOUCHER_CALTYPE = "";
public static final String XPATH_REQUEST_VOUCHER_CALNAME = "";
public static final String XPATH_REQUEST_VOUCHER_INUMBUP = "";
public static final String XPATH_REQUEST_VOUCHER_INUMDOWN ="";
public static final String XPATH_REQUEST_VOUCHER_INUMBER = "";
public static final String XPATH_REQUEST_VOUCHER_IBLOCK = "";
public static final String XPATH_REQUEST_VOUCHER_STOPDATE = "";

//日初加钞管理
public static final String XPATH_REQUEST_TERMPLUS_TERMUNM = "xBankBass/Request/termplus/termnum";
public static final String XPATH_REQUEST_TERMPLUS_ICPETELL = "xBankBass/Request/termplus/icpetell";
public static final String XPATH_REQUEST_TERMPLUS_ICPETENAME = "xBankBass/Request/termplus/icpeteName";
public static final String XPATH_REQUEST_TERMPLUS_WORKDATE = "xBankBass/Request/termplus/workdate";
public static final String XPATH_REQUEST_TERMPLUS_TELLER = "xBankBass/Request/termplus/teller";
public static final String XPATH_REQUEST_TERMPLUS_TOLTER = "xBankBass/Request/termplus/tolter";
public static final String XPATH_REQUEST_TERMPLUS_CASA = "xBankBass/Request/termplus/casA";
public static final String XPATH_REQUEST_TERMPLUS_CASB = "xBankBass/Request/termplus/casB";
public static final String XPATH_REQUEST_TERMPLUS_CASC = "xBankBass/Request/termplus/casC";
public static final String XPATH_REQUEST_TERMPLUS_CASD = "xBankBass/Request/termplus/casD";
public static final String XPATH_REQUEST_TERMPLUS_FIFTY = "xBankBass/Request/termplus/Fifty";
public static final String XPATH_REQUEST_TERMPLUS_HUNDRED = "xBankBass/Request/termplus/Hundred";
public static final String XPATH_REQUEST_TERMPLUS_TWENTY = "xBankBass/Request/termplus/Twenty";
public static final String XPATH_REQUEST_TERMPLUS_TEN = "xBankBass/Request/termplus/Ten";
public static final String XPATH_REQUEST_TERMPLUS_FIVE = "xBankBass/Request/termplus/Five";
public static final String XPATH_REQUEST_TERMPLUS_ONE = "xBankBass/Request/termplus/one";
public static final String XPATH_REQUEST_TERMPLUS_TWO = "xBankBass/Request/termplus/Two";
public static final String XPATH_REQUEST_TERMPLUS_ZFIVE = "xBankBass/Request/termplus/zFive";
public static final String XPATH_REQUEST_TERMPLUS_ZONE = "xBankBass/Request/termplus/zone";
public static final String XPATH_REQUEST_TERMPLUS_FIVEZERO = "xBankBass/Request/termplus/fiveZero";
public static final String XPATH_REQUEST_TERMPLUS_ONEZERO = "xBankBass/Request/termplus/oneZero";
public static final String XPATH_REQUEST_TERMPLUS_ZEROMONEY = "xBankBass/Request/termplus/zeromoney";
public static final String XPATH_REQUEST_TERMPLUS_CASAVAL = "xBankBass/Request/termplus/casaVal";
public static final String XPATH_REQUEST_TERMPLUS_CASBVAL = "xBankBass/Request/termplus/casbVal";
public static final String XPATH_REQUEST_TERMPLUS_CASCVAL = "xBankBass/Request/termplus/cascVal";
public static final String XPATH_REQUEST_TERMPLUS_CASDVAL = "xBankBass/Request/termplus/casdVal";


//2011-12-02 账务管理 add by ouwanjun
public static final String XPATH_REQUEST_TELLERNUM = "xBankBass/Request/TellerNum";
public static final String XPATH_REQUEST_CheckAccountType = "xBankBass/Request/CheckAccountType";
public static final String XPATH_REQUEST_DTBEGIN = "xBankBass/Request/DtBegin";
public static final String XPATH_REQUEST_DTEND = "xBankBass/Request/DtEnd";
public static final String XPATH_REQUEST_REQUESTFLAG = "xBankBass/Request/requestflag";
public static final String XPATH_REQUEST_DETAILTYPE = "xBankBass/Request/detailtype";
public static final String XPATH_REQUEST_CHECKTOTALACCONT = "xBankBass/Request/CheckTotalAccount";

// 交易类型定义 For CITIC
public static final String PRIVATE_QUERYACCOUNT = "81";// 查询余额
public static final String PRIVATE_WITHDRAW = "71";// 取款
public static final String PRIVATE_TRANSFER_OUT = "64";// 转账转出
public static final String PRIVATE_TRANSFER_IN_FIRST = "61";// 转账转入第一次
public static final String PRIVATE_TRANSFER_IN_TWICE = "62";// 转账转入第二次
public static final String PRIVATE_DEPOSIT = "11";// 存款
public static final String PRIVATE_CHANGEPWD_FIRST = "63";// 改密第一次
public static final String PRIVATE_CHANGEPWD_TWICE = "51";// 改密第二次
public static final String PRIVATE_ADDCASH = "03";//加钞
public static final String PRIVATE_CLEANTERM = "08";//清机
public static final String PRIVATE_GETWORKINGKEY = "09";// 申请工作密钥

// 完成码定义 For CITIC
public static final String COMPCODE_SUCCESS = "0110";// 主机返回交易成功,设备操作成功
public static final String COMPCODE_SOMETHING_LEFT = "0112";// 出钞口可能遗留钞
public static final String COMPCODE_DESPENSE_FAILED = "0121";// 挖钞失败
public static final String COMPCODE_FAILED = "0130";// 主机失败交易,设备操作成功
public static final String COMPCODE_TIMEOUT = "0033";// 接受主机授权超时
public static final String COMPCODE_NO_REQUEST = "0030";// 未将交易信息上送主机

// 主机通讯结果定义 For CITIC
public static final int EXCHANGE_SUCCESS = 0;// 交互成功
public static final int EXCHANGE_FAILED = 1;// 交互失败
public static final int EXCHANGE_UNCERTAIN = 2;// 交互结果不确定

//统一授权通讯接口定义
public static final String XPATH_REQUEST_AUTHOR_PAYACCTS = "xBankBass/Request/author/payaccte";
public static final String XPATH_REQUEST_AUTHOR_ACCTNAMES = "xBankBass/Request/author/accname";
public static final String XPATH_REQUEST_AUTHOR_RADIO = "xBankBass/Request/author/radio";
public static final String XPATH_REQUEST_AUTHOR_TELPWD = "xBankBass/Request/author/password";
public static final String XPATH_REQUEST_AUTHOR_TEXTDATE = "xBankBass/Request/author/workdate";
public static final String XPATH_REQUEST_AUTHOR_TELLER = "xBankBass/Request/author/teller";
public static final String XPATH_REQUEST_AUTHOR_BUYNAME = "xBankBass/Request/author/buyname";				  //交易类型
public static final String XPATH_REQUEST_AUTHOR_AUTHTELL = "xBankBass/Request/author/authteller";

public static final String XPATH_AUTHORIZATION_TELLERNUM = "xBankBass/Request/Authorization/TellerNum";       //终端号
public static final String XPATH_AUTHORIZATION_AMOUNT = "xBankBass/Request/Authorization/Amount";			  //交易金额
public static final String XPATH_AUTHORIZATION_NETADDR = "xBankBass/Request/Authorization/netaddr";           //柜员ip地址
public static final String XPATH_AUTHORIZATION_DATETIME = "xBankBass/Request/Authorization/DateTime";         //交易时间
//add by caoyifeng 交接班
public static final String XPATH_RESPONSE_TELLEROUT = "xBankBass/Response/TermNumOut";
public static final String XPATH_RESPONSE_TELLERIN = "xBankBass/Response/TermNumIn";


//add by wwl  圈存
public static final String XPATH_ACCOUNTPLAC_TERMNO= "xBankBass/AccountPlac/termno";
public static final String XPATH_ACCOUNTPLAC_PAYACCOUNT = "xBankBass/AccountPlac/payaccount";
public static final String XPATH_ACCOUNTPLAC_ICTYPE = "xBankBass/AccountPlac/ICType";
public static final String XPATH_ACCOUNTPLAC_PEYTYPE = "xBankBass/AccountPlac/peytype";
public static final String XPATH_ACCOUNTPLAC_AMOUNT = "xBankBass/AccountPlac/amount";
public static final String XPATH_ACCOUNTPLAC_PEYACCOUNT = "xBankBass/AccountPlac/peyaccount";
public static final String XPATH_ACCOUNTPLAC_ICBYSTATUS = "xBankBass/AccountPlac/ICbyStatus";
public static final String XPATH_ACCOUNTPLAC_ICDATETIME = "xBankBass/AccountPlac/ICdatetime";
public static final String XPATH_ACCOUNTPLAC_BANKNUM = "xBankBass/AccountPlac/banknum";
public static final String XPATH_ACCOUNTPLAC_TELLERNUM = "xBankBass/AccountPlac/tellernum";

//手续费
public static final String XPATH_REQUEST_POUNDAGE_TRANSTYPE  = "xBankBass/Request/Poundage/Transtype";
public static final String XPATH_REQUEST_POUNDAGE_CARDTYPE  = "xBankBass/Request/Poundage/CardType";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUM  = "xBankBass/Request/Poundage/CardNum";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUMIN = "xBankBass/Request/Poundage/CardNumIn";
public static final String XPATH_REQUEST_POUNDAGE_CARDNUMINTYPE = "xBankBass/Request/Poundage/CardNumInType";
public static final String XPATH_RESPONSE_POUNDAGE_FEEFLAG = "xBankBass/Response/Poundage/FeeFlag";

//窗口编号设置
public static final String XPATH_REQUEST_WINDOWNUM = "xBankBass/Request/windownum";
public static final String XPATH_REQUEST_WINDOWIP = "xBankBass/Request/windowip";
// 核心返回状态
public static final String HOST_RETURN_S = "S";        // 交易成功
public static final String HOST_RETURN_E = "E";        // 交易失败

public static final String XPATH_REQUEST_TERMNO = "xBankBass/Request/termno";
public static final String XPATH_REQUEST_SERVICEMODE = "xBankBass/Request/servicemode";
public static final String XPATH_RESPONSE_RETURNFLAG = "xBankBass/Response/returnFlag";
public static final String XPATH_REQUEST_ISALLCHANGE = "xBankBass/Request/isAllChange";

//清机对账时从QTMCleanCashResult取amount,如果返回的amount为空，提示柜员进行卸钞现金清点结果补录
public static final String XPATH_RESPONSE_ISRETURNFLAG = "xBankBass/Response/isReturnFlag";
//卸钞现金清点结果补录
public static final String XPATH_REQUEST_SETTLECYCLECUR = "xBankBass/Request/settleCyclecur";
public static final String XPATH_REQUEST_AMOUNTS = "xBankBass/Request/amounts";
public static final String XPATH_REQUEST_STATUS = "xBankBass/Request/status";
public static final String XPATH_REQUEST_ID = "xBankBass/Request/id";
public static final String XPATH_REQUEST_ITYPE = "xBankBass/Request/itype";
public static final String XPATH_REQUEST_STRDEALMESSAGE = "xBankBass/Request/strdealmessage";
//QTM清机对账的时候要不要更新柜员尾箱
public static final String XPATH_REQUEST_ISUPDATECASHDRAW = "xBankBass/Request/isupdatecashdraw";
//异常处理
public static final String XPATH_RESPONSE_QTMEXCEPTIONRECORDS = "xBankBass/Response/qtmExceptionRecords";
public static final String XPATH_RESPONSE_BOOKINGEXCEPTIONRECORDS = "xBankBass/Response/bookingExceptionRecords";
}
