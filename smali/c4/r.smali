.class public Lc4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/r$a;
    }
.end annotation


# static fields
.field private static final a:Lc4/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc4/n0;

    invoke-direct {v0}, Lc4/n0;-><init>()V

    sput-object v0, Lc4/r;->a:Lc4/q0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/h;Lc4/r$a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/h<",
            "TR;>;",
            "Lc4/r$a<",
            "TR;TT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lc4/r;->a:Lc4/q0;

    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v2, Lc4/o0;

    invoke-direct {v2, p0, v1, p1, v0}, Lc4/o0;-><init>(Lcom/google/android/gms/common/api/h;Lcom/google/android/gms/tasks/TaskCompletionSource;Lc4/r$a;Lc4/q0;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/h;->a(Lcom/google/android/gms/common/api/h$a;)V

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/google/android/gms/common/api/h;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            ">(",
            "Lcom/google/android/gms/common/api/h<",
            "TR;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc4/p0;

    invoke-direct {v0}, Lc4/p0;-><init>()V

    invoke-static {p0, v0}, Lc4/r;->a(Lcom/google/android/gms/common/api/h;Lc4/r$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
