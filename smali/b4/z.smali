.class final Lb4/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lb4/x;

.field static final b:Lb4/x;

.field static final c:Lb4/x;

.field static final d:Lb4/x;

.field private static final e:Ljava/lang/Object;

.field private static f:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/r;

    const-string v1, "0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\u0008s\u00f9/\u008eQ\u00ed"

    invoke-static {v1}, Lb4/v;->x(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lb4/r;-><init>([B)V

    sput-object v0, Lb4/z;->a:Lb4/x;

    new-instance v0, Lb4/s;

    const-string v1, "0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"

    invoke-static {v1}, Lb4/v;->x(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lb4/s;-><init>([B)V

    sput-object v0, Lb4/z;->b:Lb4/x;

    new-instance v0, Lb4/t;

    const-string v1, "0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"

    invoke-static {v1}, Lb4/v;->x(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lb4/t;-><init>([B)V

    sput-object v0, Lb4/z;->c:Lb4/x;

    new-instance v0, Lb4/u;

    const-string v1, "0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"

    invoke-static {v1}, Lb4/v;->x(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lb4/u;-><init>([B)V

    sput-object v0, Lb4/z;->d:Lb4/x;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb4/z;->e:Ljava/lang/Object;

    return-void
.end method

.method static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lb4/z;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lb4/z;->f:Landroid/content/Context;

    if-nez v1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lb4/z;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string p0, "GoogleCertificates"

    const-string v1, "GoogleCertificates has been initialized already"

    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
