
var projectName = '实验室管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '公告信息',
	url: './pages/gonggaoxinxi/list.html'
}, 
{
	name: '知识库',
	url: './pages/zhishiku/list.html'
}, 
{
	name: '实验课程',
	url: './pages/shiyankecheng/list.html'
}, 
{
	name: '实验室信息',
	url: './pages/shiyanshixinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springboote51e2/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"知识库","menuJump":"列表","tableName":"zhishiku"}],"menu":"知识库管理"},{"child":[{"buttons":["查看","修改","删除","查看评论"],"menu":"实验课程","menuJump":"列表","tableName":"shiyankecheng"}],"menu":"实验课程管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"实验室信息","menuJump":"列表","tableName":"shiyanshixinxi"}],"menu":"实验室信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"实验室预约","menuJump":"列表","tableName":"shiyanshiyuyue"}],"menu":"实验室预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"实验设备","menuJump":"列表","tableName":"shiyanshebei"}],"menu":"实验设备管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"采购记录","menuJump":"列表","tableName":"caigoujilu"}],"menu":"采购记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"维修记录","menuJump":"列表","tableName":"weixiujilu"}],"menu":"维修记录管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"知识库列表","menuJump":"列表","tableName":"zhishiku"}],"menu":"知识库模块"},{"child":[{"buttons":["查看"],"menu":"实验课程列表","menuJump":"列表","tableName":"shiyankecheng"}],"menu":"实验课程模块"},{"child":[{"buttons":["查看","预约"],"menu":"实验室信息列表","menuJump":"列表","tableName":"shiyanshixinxi"}],"menu":"实验室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"实验室预约","menuJump":"列表","tableName":"shiyanshiyuyue"}],"menu":"实验室预约管理"},{"child":[{"buttons":["查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"知识库列表","menuJump":"列表","tableName":"zhishiku"}],"menu":"知识库模块"},{"child":[{"buttons":["查看"],"menu":"实验课程列表","menuJump":"列表","tableName":"shiyankecheng"}],"menu":"实验课程模块"},{"child":[{"buttons":["查看","预约"],"menu":"实验室信息列表","menuJump":"列表","tableName":"shiyanshixinxi"}],"menu":"实验室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"公告信息","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"知识库","menuJump":"列表","tableName":"zhishiku"}],"menu":"知识库管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"实验课程","menuJump":"列表","tableName":"shiyankecheng"}],"menu":"实验课程管理"},{"child":[{"buttons":["查看","删除","审核"],"menu":"实验室预约","menuJump":"列表","tableName":"shiyanshiyuyue"}],"menu":"实验室预约管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"公告信息列表","menuJump":"列表","tableName":"gonggaoxinxi"}],"menu":"公告信息模块"},{"child":[{"buttons":["查看"],"menu":"知识库列表","menuJump":"列表","tableName":"zhishiku"}],"menu":"知识库模块"},{"child":[{"buttons":["查看"],"menu":"实验课程列表","menuJump":"列表","tableName":"shiyankecheng"}],"menu":"实验课程模块"},{"child":[{"buttons":["查看","预约"],"menu":"实验室信息列表","menuJump":"列表","tableName":"shiyanshixinxi"}],"menu":"实验室信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
