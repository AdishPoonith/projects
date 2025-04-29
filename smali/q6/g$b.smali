.class public Lq6/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Lq6/g$d;

.field private final b:J

.field private final c:Ljava/lang/Runnable;

.field private d:Ljava/util/concurrent/ScheduledFuture;

.field final synthetic e:Lq6/g;


# direct methods
.method private constructor <init>(Lq6/g;Lq6/g$d;JLjava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lq6/g$b;->e:Lq6/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq6/g$b;->a:Lq6/g$d;

    iput-wide p3, p0, Lq6/g$b;->b:J

    iput-object p5, p0, Lq6/g$b;->c:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lq6/g;Lq6/g$d;JLjava/lang/Runnable;Lq6/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lq6/g$b;-><init>(Lq6/g;Lq6/g$d;JLjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lq6/g$b;)V
    .locals 0

    invoke-direct {p0}, Lq6/g$b;->d()V

    return-void
.end method

.method static synthetic b(Lq6/g$b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq6/g$b;->f(J)V

    return-void
.end method

.method private d()V
    .locals 1

    iget-object v0, p0, Lq6/g$b;->e:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->w()V

    iget-object v0, p0, Lq6/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lq6/g$b;->e()V

    iget-object v0, p0, Lq6/g$b;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lq6/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Caller should have verified scheduledFuture is non-null."

    invoke-static {v0, v2, v1}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lq6/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Lq6/g$b;->e:Lq6/g;

    invoke-static {v0, p0}, Lq6/g;->f(Lq6/g;Lq6/g$b;)V

    return-void
.end method

.method private f(J)V
    .locals 3

    iget-object v0, p0, Lq6/g$b;->e:Lq6/g;

    invoke-static {v0}, Lq6/g;->e(Lq6/g;)Lq6/g$c;

    move-result-object v0

    new-instance v1, Lq6/h;

    invoke-direct {v1, p0}, Lq6/h;-><init>(Lq6/g$b;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1, p2, v2}, Lq6/g$c;->d(Lq6/g$c;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lq6/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lq6/g$b;->e:Lq6/g;

    invoke-virtual {v0}, Lq6/g;->w()V

    iget-object v0, p0, Lq6/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    invoke-direct {p0}, Lq6/g$b;->e()V

    :cond_0
    return-void
.end method
