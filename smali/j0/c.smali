.class public Lj0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;
.implements Lr8/k$c;
.implements Lj8/a;


# instance fields
.field private final j:Lj0/a;

.field private k:Lj8/c;

.field private l:Lr8/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj0/a;

    invoke-direct {v0}, Lj0/a;-><init>()V

    iput-object v0, p0, Lj0/c;->j:Lj0/a;

    return-void
.end method

.method private a(Lj8/c;)V
    .locals 1

    iput-object p1, p0, Lj0/c;->k:Lj8/c;

    iget-object v0, p0, Lj0/c;->j:Lj0/a;

    iget-object v0, v0, Lj0/a;->b:Lj0/b;

    invoke-interface {p1, v0}, Lj8/c;->b(Lr8/m;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lj0/c;->k:Lj8/c;

    iget-object v1, p0, Lj0/c;->j:Lj0/a;

    iget-object v1, v1, Lj0/a;->b:Lj0/b;

    invoke-interface {v0, v1}, Lj8/c;->g(Lr8/m;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lj0/c;->k:Lj8/c;

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 3

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "getUserData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "expressLogin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "login"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "logOut"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_4
    const-string v1, "getAccessToken"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto :goto_1

    :pswitch_0
    const-string v0, "fields"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lj0/c;->j:Lj0/a;

    invoke-virtual {v0, p1, p2}, Lj0/a;->d(Ljava/lang/String;Lr8/k$d;)V

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, Lj0/c;->j:Lj0/a;

    iget-object v0, p0, Lj0/c;->k:Lj8/c;

    invoke-interface {v0}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lj0/a;->a(Landroid/app/Activity;Lr8/k$d;)V

    goto :goto_1

    :pswitch_2
    const-string v0, "permissions"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const-string v1, "loginBehavior"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lj0/c;->j:Lj0/a;

    invoke-virtual {v1, p1}, Lj0/a;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lj0/c;->j:Lj0/a;

    iget-object v1, p0, Lj0/c;->k:Lj8/c;

    invoke-interface {v1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p1, v1, v0, p2}, Lj0/a;->f(Landroid/app/Activity;Ljava/util/List;Lr8/k$d;)V

    goto :goto_1

    :pswitch_3
    iget-object p1, p0, Lj0/c;->j:Lj0/a;

    invoke-virtual {p1, p2}, Lj0/a;->e(Lr8/k$d;)V

    goto :goto_1

    :pswitch_4
    iget-object p1, p0, Lj0/c;->j:Lj0/a;

    invoke-virtual {p1, p2}, Lj0/a;->c(Lr8/k$d;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x644fe641 -> :sswitch_4
        -0x41686296 -> :sswitch_3
        0x625ef69 -> :sswitch_2
        0x42c895d9 -> :sswitch_1
        0x6bf0af8b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Li8/a$b;)V
    .locals 1

    iget-object p1, p0, Lj0/c;->l:Lr8/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lj0/c;->a(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lj0/c;->a(Lj8/c;)V

    return-void
.end method

.method public g()V
    .locals 0

    invoke-direct {p0}, Lj0/c;->b()V

    return-void
.end method

.method public j()V
    .locals 0

    invoke-direct {p0}, Lj0/c;->b()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    new-instance v0, Lr8/k;

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const-string v1, "app.meedu/flutter_facebook_auth"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lj0/c;->l:Lr8/k;

    invoke-virtual {v0, p0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method
