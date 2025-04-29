.class public Lp1/y;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/y$a;
    }
.end annotation


# static fields
.field public static final o0:Lp1/y$a;


# instance fields
.field private j0:Ljava/lang/String;

.field private k0:Lp1/u$e;

.field private l0:Lp1/u;

.field private m0:Landroidx/activity/result/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/c<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/y$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp1/y;->o0:Lp1/y$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic I1(Lp1/y;Lp1/u$f;)V
    .locals 0

    invoke-static {p0, p1}, Lp1/y;->T1(Lp1/y;Lp1/u$f;)V

    return-void
.end method

.method public static synthetic J1(Lda/l;Landroidx/activity/result/a;)V
    .locals 0

    invoke-static {p0, p1}, Lp1/y;->U1(Lda/l;Landroidx/activity/result/a;)V

    return-void
.end method

.method public static final synthetic K1(Lp1/y;)V
    .locals 0

    invoke-direct {p0}, Lp1/y;->R1()V

    return-void
.end method

.method public static final synthetic L1(Lp1/y;)V
    .locals 0

    invoke-direct {p0}, Lp1/y;->Y1()V

    return-void
.end method

.method private final Q1(Landroidx/fragment/app/e;)Lda/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/e;",
            ")",
            "Lda/l<",
            "Landroidx/activity/result/a;",
            "Ls9/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp1/y$b;

    invoke-direct {v0, p0, p1}, Lp1/y$b;-><init>(Lp1/y;Landroidx/fragment/app/e;)V

    return-object v0
.end method

.method private final R1()V
    .locals 2

    iget-object v0, p0, Lp1/y;->n0:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lp1/y;->W1()V

    return-void

    :cond_0
    const-string v0, "progressBar"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final S1(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p1}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lp1/y;->j0:Ljava/lang/String;

    return-void
.end method

.method private static final T1(Lp1/y;Lp1/u$f;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outcome"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lp1/y;->V1(Lp1/u$f;)V

    return-void
.end method

.method private static final U1(Lda/l;Landroidx/activity/result/a;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final V1(Lp1/u$f;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/y;->k0:Lp1/u$e;

    iget-object v0, p1, Lp1/u$f;->j:Lp1/u$f$a;

    sget-object v1, Lp1/u$f$a;->l:Lp1/u$f$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "com.facebook.LoginFragment:Result"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->X()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method private final Y1()V
    .locals 2

    iget-object v0, p0, Lp1/y;->n0:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lp1/y;->X1()V

    return-void

    :cond_0
    const-string v0, "progressBar"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public D0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->D0()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->S()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget v1, Ld1/b;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public I0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->I0()V

    iget-object v0, p0, Lp1/y;->j0:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "LoginFragment"

    const-string v1, "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()Landroidx/fragment/app/e;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object v0

    iget-object v1, p0, Lp1/y;->k0:Lp1/u$e;

    invoke-virtual {v0, v1}, Lp1/u;->K(Lp1/u$e;)V

    return-void
.end method

.method public J0(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->J0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object v0

    const-string v1, "loginClient"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected M1()Lp1/u;
    .locals 1

    new-instance v0, Lp1/u;

    invoke-direct {v0, p0}, Lp1/u;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method public final N1()Landroidx/activity/result/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/c<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp1/y;->m0:Landroidx/activity/result/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "launcher"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected O1()I
    .locals 1

    sget v0, Ld1/c;->c:I

    return v0
.end method

.method public final P1()Lp1/u;
    .locals 1

    iget-object v0, p0, Lp1/y;->l0:Lp1/u;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "loginClient"

    invoke-static {v0}, Lkotlin/jvm/internal/l;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method protected W1()V
    .locals 0

    return-void
.end method

.method protected X1()V
    .locals 0

    return-void
.end method

.method public i0(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->i0(IILandroid/content/Intent;)V

    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lp1/u;->G(IILandroid/content/Intent;)Z

    return-void
.end method

.method public n0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->n0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "loginClient"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lp1/u;

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1, p0}, Lp1/u;->I(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/y;->M1()Lp1/u;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lp1/y;->l0:Lp1/u;

    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object p1

    new-instance v0, Lp1/x;

    invoke-direct {v0, p0}, Lp1/x;-><init>(Lp1/y;)V

    invoke-virtual {p1, v0}, Lp1/u;->J(Lp1/u$d;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n()Landroidx/fragment/app/e;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0, p1}, Lp1/y;->S1(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "com.facebook.LoginFragment:Request"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "request"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lp1/u$e;

    iput-object v0, p0, Lp1/y;->k0:Lp1/u$e;

    :cond_3
    new-instance v0, Le/f;

    invoke-direct {v0}, Le/f;-><init>()V

    invoke-direct {p0, p1}, Lp1/y;->Q1(Landroidx/fragment/app/e;)Lda/l;

    move-result-object p1

    new-instance v1, Lp1/w;

    invoke-direct {v1, p1}, Lp1/w;-><init>(Lda/l;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->n1(Le/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object p1

    const-string v0, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lp1/y;->m0:Landroidx/activity/result/c;

    return-void
.end method

.method public r0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lp1/y;->O1()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Ld1/b;->d:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lp1/y;->n0:Landroid/view/View;

    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object p2

    new-instance p3, Lp1/y$c;

    invoke-direct {p3, p0}, Lp1/y$c;-><init>(Lp1/y;)V

    invoke-virtual {p2, p3}, Lp1/u;->H(Lp1/u$a;)V

    return-object p1
.end method

.method public s0()V
    .locals 1

    invoke-virtual {p0}, Lp1/y;->P1()Lp1/u;

    move-result-object v0

    invoke-virtual {v0}, Lp1/u;->c()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->s0()V

    return-void
.end method
