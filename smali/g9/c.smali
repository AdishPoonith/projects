.class public final Lg9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# instance fields
.field private j:Landroid/content/Context;

.field private k:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/c;->j:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Lg9/c;)V
    .locals 0

    invoke-static {p0}, Lg9/c;->c(Lg9/c;)V

    return-void
.end method

.method public static final synthetic b(Lg9/c;Landroid/widget/Toast;)V
    .locals 0

    iput-object p1, p0, Lg9/c;->k:Landroid/widget/Toast;

    return-void
.end method

.method private static final c(Lg9/c;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 11

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    const-string v1, "showToast"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "length"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "gravity"

    invoke-virtual {p1, v3}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "bgcolor"

    invoke-virtual {p1, v4}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    const-string v5, "textcolor"

    invoke-virtual {p1, v5}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    const-string v6, "fontSize"

    invoke-virtual {p1, v6}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v6, "top"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0x11

    const/16 v8, 0x30

    if-eqz v6, :cond_0

    const/16 v3, 0x30

    goto :goto_0

    :cond_0
    const-string v6, "center"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x11

    goto :goto_0

    :cond_1
    const/16 v3, 0x50

    :goto_0
    const-string v6, "long"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v6, 0x1f

    if-eqz v4, :cond_5

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v9, v6, :cond_5

    iget-object v9, p0, Lg9/c;->j:Landroid/content/Context;

    const-string v10, "layout_inflater"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/LayoutInflater;

    sget v10, Lg9/f;->a:I

    invoke-virtual {v9, v10, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    sget v9, Lg9/e;->a:I

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lg9/c;->j:Landroid/content/Context;

    sget v10, Lg9/d;->a:I

    invoke-virtual {v0, v10}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v4, v10}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v9, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_3
    new-instance p1, Landroid/widget/Toast;

    iget-object v0, p0, Lg9/c;->j:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lg9/c;->k:Landroid/widget/Toast;

    invoke-virtual {p1, v1}, Landroid/widget/Toast;->setDuration(I)V

    iget-object p1, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    goto :goto_2

    :cond_5
    iget-object v4, p0, Lg9/c;->j:Landroid/content/Context;

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lg9/c;->k:Landroid/widget/Toast;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v1, v6, :cond_8

    if-eqz v0, :cond_6

    :try_start_0
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v2

    goto :goto_1

    :catch_0
    nop

    goto :goto_2

    :cond_6
    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    const v0, 0x102000b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    :goto_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt p1, v6, :cond_b

    const/4 v0, 0x0

    if-eq v3, v7, :cond_a

    const/16 v1, 0x64

    iget-object v2, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eq v3, v8, :cond_9

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_9
    if-eqz v2, :cond_b

    :goto_3
    invoke-virtual {v2, v3, v0, v1}, Landroid/widget/Toast;->setGravity(III)V

    goto :goto_4

    :cond_a
    iget-object v1, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eqz v1, :cond_b

    invoke-virtual {v1, v3, v0, v0}, Landroid/widget/Toast;->setGravity(III)V

    :cond_b
    :goto_4
    iget-object v0, p0, Lg9/c;->j:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_c

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Lg9/b;

    invoke-direct {v1, p0}, Lg9/b;-><init>(Lg9/c;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_5

    :cond_c
    iget-object v0, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_d
    :goto_5
    const/16 v0, 0x1e

    if-lt p1, v0, :cond_10

    iget-object p1, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eqz p1, :cond_10

    new-instance v0, Lg9/c$a;

    invoke-direct {v0, p0}, Lg9/c$a;-><init>(Lg9/c;)V

    invoke-virtual {p1, v0}, Landroid/widget/Toast;->addCallback(Landroid/widget/Toast$Callback;)V

    goto :goto_6

    :cond_e
    const-string p1, "cancel"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    iget-object p1, p0, Lg9/c;->k:Landroid/widget/Toast;

    if-eqz p1, :cond_10

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/widget/Toast;->cancel()V

    :cond_f
    iput-object v2, p0, Lg9/c;->k:Landroid/widget/Toast;

    :cond_10
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_7

    :cond_11
    invoke-interface {p2}, Lr8/k$d;->c()V

    :goto_7
    return-void
.end method
