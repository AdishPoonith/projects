.class public Lf1/q0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Lf1/q0$e;

.field private f:Landroid/os/Bundle;

.field private g:Lp0/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lp0/a;->u:Lp0/a$c;

    invoke-virtual {v0}, Lp0/a$c;->e()Lp0/a;

    move-result-object v1

    iput-object v1, p0, Lf1/q0$a;->g:Lp0/a;

    invoke-virtual {v0}, Lp0/a$c;->g()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lf1/l0;->a:Lf1/l0;

    invoke-static {p1}, Lf1/l0;->F(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lf1/q0$a;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p1, Lp0/s;

    const-string p2, "Attempted to create a builder without a valid access token or a valid default Application ID."

    invoke-direct {p1, p2}, Lp0/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lf1/q0$a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    sget-object p2, Lf1/l0;->a:Lf1/l0;

    invoke-static {p1}, Lf1/l0;->F(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    sget-object v0, Lf1/m0;->a:Lf1/m0;

    const-string v0, "applicationId"

    invoke-static {p2, v0}, Lf1/m0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lf1/q0$a;->b:Ljava/lang/String;

    invoke-direct {p0, p1, p3, p4}, Lf1/q0$a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lf1/q0$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lf1/q0$a;->c:Ljava/lang/String;

    if-eqz p3, :cond_0

    iput-object p3, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lf1/q0;
    .locals 9

    iget-object v0, p0, Lf1/q0$a;->g:Lp0/a;

    const-string v1, "app_id"

    if-eqz v0, :cond_4

    iget-object v2, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    move-object v0, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lp0/a;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lf1/q0$a;->g:Lp0/a;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lp0/a;->s()Ljava/lang/String;

    move-result-object v3

    :goto_2
    const-string v1, "access_token"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lf1/q0$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    sget-object v3, Lf1/q0;->v:Lf1/q0$b;

    iget-object v4, p0, Lf1/q0$a;->a:Landroid/content/Context;

    if-eqz v4, :cond_6

    iget-object v5, p0, Lf1/q0$a;->c:Ljava/lang/String;

    iget-object v6, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    iget v7, p0, Lf1/q0$a;->d:I

    iget-object v8, p0, Lf1/q0$a;->e:Lf1/q0$e;

    invoke-virtual/range {v3 .. v8}, Lf1/q0$b;->c(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILf1/q0$e;)Lf1/q0;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf1/q0$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf1/q0$a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e()Lf1/q0$e;
    .locals 1

    iget-object v0, p0, Lf1/q0$a;->e:Lf1/q0$e;

    return-object v0
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lf1/q0$a;->f:Landroid/os/Bundle;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lf1/q0$a;->d:I

    return v0
.end method

.method public final h(Lf1/q0$e;)Lf1/q0$a;
    .locals 0

    iput-object p1, p0, Lf1/q0$a;->e:Lf1/q0$e;

    return-object p0
.end method
