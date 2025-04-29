.class public final Lq6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Ljava/util/concurrent/Executor;

.field public static final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    sput-object v0, Lq6/p;->a:Ljava/util/concurrent/Executor;

    sget-object v0, Landroidx/profileinstaller/g;->j:Landroidx/profileinstaller/g;

    sput-object v0, Lq6/p;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Lq6/a0;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Lq6/a0;-><init>(ILjava/util/concurrent/Executor;)V

    sput-object v0, Lq6/p;->c:Ljava/util/concurrent/Executor;

    return-void
.end method
