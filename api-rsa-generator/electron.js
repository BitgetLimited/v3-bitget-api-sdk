const { app, BrowserWindow } = require('electron');

// window对象的全局引用
let mainWindow
function createWindow() {

  mainWindow = new BrowserWindow({ width: 800, height: 600 })

  // 开发环境
  // mainWindow.loadURL('http://localhost:3000/');

  // 生产环境 
  mainWindow.loadFile(`${__dirname}/build/index.html`);


  // 打开开发者工具，默认不打开
  // mainWindow.webContents.openDevTools()

  // 关闭window时触发下列事件.
  mainWindow.on('closed', function () {
    mainWindow = null
  })
}

app.on('ready', createWindow);

// 所有窗口关闭时退出应用.
app.on('window-all-closed', function () {
  if (process.platform !== 'darwin') {
    app.quit()
  }
})

app.on('activate', function () {

  if (mainWindow === null) {
    createWindow()
  }
})