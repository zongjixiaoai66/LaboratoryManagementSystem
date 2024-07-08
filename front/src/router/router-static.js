import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import shiyanshiyuyue from '@/views/modules/shiyanshiyuyue/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import weixiujilu from '@/views/modules/weixiujilu/list'
    import zhishiku from '@/views/modules/zhishiku/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import storeup from '@/views/modules/storeup/list'
    import discussshiyankecheng from '@/views/modules/discussshiyankecheng/list'
    import caigoujilu from '@/views/modules/caigoujilu/list'
    import shiyanshixinxi from '@/views/modules/shiyanshixinxi/list'
    import shiyanshebei from '@/views/modules/shiyanshebei/list'
    import discussgonggaoxinxi from '@/views/modules/discussgonggaoxinxi/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import config from '@/views/modules/config/list'
    import shiyankecheng from '@/views/modules/shiyankecheng/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/shiyanshiyuyue',
        name: '实验室预约',
        component: shiyanshiyuyue
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/weixiujilu',
        name: '维修记录',
        component: weixiujilu
      }
      ,{
	path: '/zhishiku',
        name: '知识库',
        component: zhishiku
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discussshiyankecheng',
        name: '实验课程评论',
        component: discussshiyankecheng
      }
      ,{
	path: '/caigoujilu',
        name: '采购记录',
        component: caigoujilu
      }
      ,{
	path: '/shiyanshixinxi',
        name: '实验室信息',
        component: shiyanshixinxi
      }
      ,{
	path: '/shiyanshebei',
        name: '实验设备',
        component: shiyanshebei
      }
      ,{
	path: '/discussgonggaoxinxi',
        name: '公告信息评论',
        component: discussgonggaoxinxi
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/shiyankecheng',
        name: '实验课程',
        component: shiyankecheng
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
