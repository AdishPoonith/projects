.class public final Lq0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq0/y;

    invoke-direct {v0}, Lq0/y;-><init>()V

    sput-object v0, Lq0/y;->a:Lq0/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()V
    .locals 2

    const-class v0, Lq0/y;

    invoke-static {v0}, Lk1/a;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    sget-object v1, Lf1/v;->a:Lf1/v;

    new-instance v1, Lq0/y$a;

    invoke-direct {v1}, Lq0/y$a;-><init>()V

    invoke-static {v1}, Lf1/v;->d(Lf1/v$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v1, v0}, Lk1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
