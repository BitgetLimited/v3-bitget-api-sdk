package applogger

import (
	"go.uber.org/zap"
	"go.uber.org/zap/zapcore"
	"os"
)

var sugaredLogger *zap.SugaredLogger
var atomicLevel zap.AtomicLevel

func init() {
	encoderCfg := zapcore.EncoderConfig{
		TimeKey:     "time",
		MessageKey:  "msg",
		LevelKey:    "level",
		EncodeLevel: zapcore.CapitalColorLevelEncoder,
		EncodeTime:  zapcore.ISO8601TimeEncoder,
	}

	// define default level as debug level
	atomicLevel = zap.NewAtomicLevel()
	atomicLevel.SetLevel(zapcore.DebugLevel)

	core := zapcore.NewCore(zapcore.NewConsoleEncoder(encoderCfg), os.Stdout, atomicLevel)
	sugaredLogger = zap.New(core).Sugar()
}

func SetLevel(level zapcore.Level) {
	atomicLevel.SetLevel(level)
}

func Fatal(template string, args ...interface{}) {
	sugaredLogger.Fatalf(template, args...)
}

func Error(template string, args ...interface{}) {
	sugaredLogger.Errorf(template, args...)
}

func Panic(template string, args ...interface{}) {
	sugaredLogger.Panicf(template, args...)
}

func Warn(template string, args ...interface{}) {
	sugaredLogger.Warnf(template, args...)
}

func Info(template string, args ...interface{}) {
	sugaredLogger.Infof(template, args...)
}

func Debug(template string, args ...interface{}) {
	sugaredLogger.Debugf(template, args...)
}
