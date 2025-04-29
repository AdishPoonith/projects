.class public final Li9/a1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/a1$b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Li9/g1;

.field private final c:Li9/n1;

.field private final d:Li9/a1$h;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Li9/f;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;Li9/g1;Li9/n1;Li9/a1$h;Ljava/util/concurrent/ScheduledExecutorService;Li9/f;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultPort not set"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Li9/a1$b;->a:I

    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/g1;

    iput-object p1, p0, Li9/a1$b;->b:Li9/g1;

    const-string p1, "syncContext not set"

    invoke-static {p3, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/n1;

    iput-object p1, p0, Li9/a1$b;->c:Li9/n1;

    const-string p1, "serviceConfigParser not set"

    invoke-static {p4, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/a1$h;

    iput-object p1, p0, Li9/a1$b;->d:Li9/a1$h;

    iput-object p5, p0, Li9/a1$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Li9/a1$b;->f:Li9/f;

    iput-object p7, p0, Li9/a1$b;->g:Ljava/util/concurrent/Executor;

    iput-object p8, p0, Li9/a1$b;->h:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Integer;Li9/g1;Li9/n1;Li9/a1$h;Ljava/util/concurrent/ScheduledExecutorService;Li9/f;Ljava/util/concurrent/Executor;Ljava/lang/String;Li9/a1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Li9/a1$b;-><init>(Ljava/lang/Integer;Li9/g1;Li9/n1;Li9/a1$h;Ljava/util/concurrent/ScheduledExecutorService;Li9/f;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    return-void
.end method

.method public static f()Li9/a1$b$a;
    .locals 1

    new-instance v0, Li9/a1$b$a;

    invoke-direct {v0}, Li9/a1$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/a1$b;->a:I

    return v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Li9/a1$b;->g:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Li9/g1;
    .locals 1

    iget-object v0, p0, Li9/a1$b;->b:Li9/g1;

    return-object v0
.end method

.method public d()Li9/a1$h;
    .locals 1

    iget-object v0, p0, Li9/a1$b;->d:Li9/a1$h;

    return-object v0
.end method

.method public e()Li9/n1;
    .locals 1

    iget-object v0, p0, Li9/a1$b;->c:Li9/n1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget v1, p0, Li9/a1$b;->a:I

    const-string v2, "defaultPort"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->b(Ljava/lang/String;I)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->b:Li9/g1;

    const-string v2, "proxyDetector"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->c:Li9/n1;

    const-string v2, "syncContext"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->d:Li9/a1$h;

    const-string v2, "serviceConfigParser"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    const-string v2, "scheduledExecutorService"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->f:Li9/f;

    const-string v2, "channelLogger"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->g:Ljava/util/concurrent/Executor;

    const-string v2, "executor"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/a1$b;->h:Ljava/lang/String;

    const-string v2, "overrideAuthority"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
