.class public Lp1/p0;
.super Lp1/o0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/p0$a;,
        Lp1/p0$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp1/p0;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Lp1/p0$c;


# instance fields
.field private o:Lf1/q0;

.field private p:Ljava/lang/String;

.field private final q:Ljava/lang/String;

.field private final r:Lp0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/p0$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/p0$c;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp1/p0;->s:Lp1/p0$c;

    new-instance v0, Lp1/p0$b;

    invoke-direct {v0}, Lp1/p0$b;-><init>()V

    sput-object v0, Lp1/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/o0;-><init>(Landroid/os/Parcel;)V

    const-string v0, "web_view"

    iput-object v0, p0, Lp1/p0;->q:Ljava/lang/String;

    sget-object v0, Lp0/h;->o:Lp0/h;

    iput-object v0, p0, Lp1/p0;->r:Lp0/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp1/p0;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lp1/u;)V
    .locals 1

    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/o0;-><init>(Lp1/u;)V

    const-string p1, "web_view"

    iput-object p1, p0, Lp1/p0;->q:Ljava/lang/String;

    sget-object p1, Lp0/h;->o:Lp0/h;

    iput-object p1, p0, Lp1/p0;->r:Lp0/h;

    return-void
.end method


# virtual methods
.method public E()Lp0/h;
    .locals 1

    iget-object v0, p0, Lp1/p0;->r:Lp0/h;

    return-object v0
.end method

.method public final I(Lp1/u$e;Landroid/os/Bundle;Lp0/s;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lp1/o0;->G(Lp1/u$e;Landroid/os/Bundle;Lp0/s;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lp1/p0;->o:Lf1/q0;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf1/q0;->cancel()V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp1/p0;->o:Lf1/q0;

    :cond_1
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp1/p0;->q:Ljava/lang/String;

    return-object v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lp1/f0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lp1/p0;->p:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public z(Lp1/u$e;)I
    .locals 6

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lp1/o0;->C(Lp1/u$e;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lp1/p0$d;

    invoke-direct {v1, p0, p1}, Lp1/p0$d;-><init>(Lp1/p0;Lp1/u$e;)V

    sget-object v2, Lp1/u;->v:Lp1/u$c;

    invoke-virtual {v2}, Lp1/u$c;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lp1/p0;->p:Ljava/lang/String;

    const-string v3, "e2e"

    invoke-virtual {p0, v3, v2}, Lp1/f0;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lp1/f0;->d()Lp1/u;

    move-result-object v2

    invoke-virtual {v2}, Lp1/u;->l()Landroidx/fragment/app/e;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object v3, Lf1/l0;->a:Lf1/l0;

    invoke-static {v2}, Lf1/l0;->R(Landroid/content/Context;)Z

    move-result v3

    new-instance v4, Lp1/p0$a;

    invoke-virtual {p1}, Lp1/u$e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, p0, v2, v5, v0}, Lp1/p0$a;-><init>(Lp1/p0;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lp1/p0;->p:Ljava/lang/String;

    const-string v5, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v0}, Lp1/p0$a;->m(Ljava/lang/String;)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lp1/p0$a;->p(Z)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lp1/u$e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/p0$a;->k(Ljava/lang/String;)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lp1/u$e;->m()Lp1/t;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/p0$a;->q(Lp1/t;)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lp1/u$e;->p()Lp1/i0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/p0$a;->r(Lp1/i0;)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lp1/u$e;->C()Z

    move-result v3

    invoke-virtual {v0, v3}, Lp1/p0$a;->o(Z)Lp1/p0$a;

    move-result-object v0

    invoke-virtual {p1}, Lp1/u$e;->L()Z

    move-result p1

    invoke-virtual {v0, p1}, Lp1/p0$a;->s(Z)Lp1/p0$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lf1/q0$a;->h(Lf1/q0$e;)Lf1/q0$a;

    move-result-object p1

    invoke-virtual {p1}, Lf1/q0$a;->a()Lf1/q0;

    move-result-object p1

    iput-object p1, p0, Lp1/p0;->o:Lf1/q0;

    new-instance p1, Lf1/i;

    invoke-direct {p1}, Lf1/i;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->E1(Z)V

    iget-object v1, p0, Lp1/p0;->o:Lf1/q0;

    invoke-virtual {p1, v1}, Lf1/i;->c2(Landroid/app/Dialog;)V

    invoke-virtual {v2}, Landroidx/fragment/app/e;->F()Landroidx/fragment/app/n;

    move-result-object v1

    const-string v2, "FacebookDialogFragment"

    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/d;->U1(Landroidx/fragment/app/n;Ljava/lang/String;)V

    return v0
.end method
