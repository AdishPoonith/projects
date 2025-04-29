.class public abstract Ln3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/c0$a;
    }
.end annotation


# instance fields
.field private a:Ln3/c0$a;

.field private b:Lo3/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Lo3/f;
    .locals 1

    iget-object v0, p0, Ln3/c0;->b:Lo3/f;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/f;

    return-object v0
.end method

.method public b(Ln3/c0$a;Lo3/f;)V
    .locals 0

    iput-object p1, p0, Ln3/c0;->a:Ln3/c0$a;

    iput-object p2, p0, Ln3/c0;->b:Lo3/f;

    return-void
.end method

.method protected final c()V
    .locals 1

    iget-object v0, p0, Ln3/c0;->a:Ln3/c0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln3/c0$a;->d()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln3/c0;->a:Ln3/c0$a;

    iput-object v0, p0, Ln3/c0;->b:Lo3/f;

    return-void
.end method

.method public abstract g([Ls1/n3;Lu2/v0;Lu2/u$b;Ls1/y3;)Ln3/d0;
.end method

.method public h(Lu1/e;)V
    .locals 0

    return-void
.end method
