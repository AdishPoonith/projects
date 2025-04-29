.class public final Lp0/t0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lp0/t0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lp0/a;->u:Lp0/a$c;

    invoke-virtual {v0}, Lp0/a$c;->e()Lp0/a;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lp0/a$c;->g()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp0/t0$b;->c(Lp0/t0;)V

    return-void

    :cond_1
    sget-object v0, Lf1/l0;->a:Lf1/l0;

    invoke-virtual {v1}, Lp0/a;->s()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lp0/t0$b$a;

    invoke-direct {v1}, Lp0/t0$b$a;-><init>()V

    invoke-static {v0, v1}, Lf1/l0;->D(Ljava/lang/String;Lf1/l0$a;)V

    return-void
.end method

.method public final b()Lp0/t0;
    .locals 1

    sget-object v0, Lp0/v0;->d:Lp0/v0$a;

    invoke-virtual {v0}, Lp0/v0$a;->a()Lp0/v0;

    move-result-object v0

    invoke-virtual {v0}, Lp0/v0;->c()Lp0/t0;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lp0/t0;)V
    .locals 1

    sget-object v0, Lp0/v0;->d:Lp0/v0$a;

    invoke-virtual {v0}, Lp0/v0$a;->a()Lp0/v0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp0/v0;->f(Lp0/t0;)V

    return-void
.end method
