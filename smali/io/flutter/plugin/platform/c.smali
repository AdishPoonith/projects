.class public Lio/flutter/plugin/platform/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugin/platform/c$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lq8/i;

.field private final c:Lio/flutter/plugin/platform/c$d;

.field private d:Lq8/i$j;

.field private e:I

.field final f:Lq8/i$h;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lq8/i;Lio/flutter/plugin/platform/c$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/plugin/platform/c$a;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/c$a;-><init>(Lio/flutter/plugin/platform/c;)V

    iput-object v0, p0, Lio/flutter/plugin/platform/c;->f:Lq8/i$h;

    iput-object p1, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    iput-object p2, p0, Lio/flutter/plugin/platform/c;->b:Lq8/i;

    invoke-virtual {p2, v0}, Lq8/i;->l(Lq8/i$h;)V

    iput-object p3, p0, Lio/flutter/plugin/platform/c;->c:Lio/flutter/plugin/platform/c$d;

    const/16 p1, 0x500

    iput p1, p0, Lio/flutter/plugin/platform/c;->e:I

    return-void
.end method

.method static synthetic a(Lio/flutter/plugin/platform/c;Lq8/i$i;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->q(Lq8/i$i;)V

    return-void
.end method

.method static synthetic b(Lio/flutter/plugin/platform/c;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->y(I)V

    return-void
.end method

.method static synthetic c(Lio/flutter/plugin/platform/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->t(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lio/flutter/plugin/platform/c;)Z
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/platform/c;->n()Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lio/flutter/plugin/platform/c;)Lq8/i;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugin/platform/c;->b:Lq8/i;

    return-object p0
.end method

.method static synthetic f(Lio/flutter/plugin/platform/c;Lq8/i$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->u(Lq8/i$c;)V

    return-void
.end method

.method static synthetic g(Lio/flutter/plugin/platform/c;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->x(Ljava/util/List;)V

    return-void
.end method

.method static synthetic h(Lio/flutter/plugin/platform/c;Lq8/i$k;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->w(Lq8/i$k;)V

    return-void
.end method

.method static synthetic i(Lio/flutter/plugin/platform/c;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/platform/c;->v()V

    return-void
.end method

.method static synthetic j(Lio/flutter/plugin/platform/c;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/platform/c;->s()V

    return-void
.end method

.method static synthetic k(Lio/flutter/plugin/platform/c;Lq8/i$j;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->z(Lq8/i$j;)V

    return-void
.end method

.method static synthetic l(Lio/flutter/plugin/platform/c;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugin/platform/c;->r()V

    return-void
.end method

.method static synthetic m(Lio/flutter/plugin/platform/c;Lq8/i$e;)Ljava/lang/CharSequence;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugin/platform/c;->p(Lq8/i$e;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private n()Z
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const-string v1, "text/*"

    invoke-virtual {v0, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private p(Lq8/i$e;)Ljava/lang/CharSequence;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    if-eqz p1, :cond_3

    sget-object v1, Lq8/i$e;->k:Lq8/i$e;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    return-object v2

    :cond_3
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v1

    const-string v3, "text/*"

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    :cond_4
    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v2

    :catch_1
    move-exception p1

    const-string v0, "PlatformPlugin"

    const-string v1, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"

    invoke-static {v0, v1, p1}, Ld8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2
.end method

.method private q(Lq8/i$i;)V
    .locals 1

    sget-object v0, Lq8/i$i;->k:Lq8/i$i;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->playSoundEffect(I)V

    :cond_0
    return-void
.end method

.method private r()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->c:Lio/flutter/plugin/platform/c$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/plugin/platform/c$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    instance-of v1, v0, Landroidx/activity/l;

    if-eqz v1, :cond_1

    check-cast v0, Landroidx/activity/l;

    invoke-interface {v0}, Landroidx/activity/l;->i()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->e()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method private s()V
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugin/platform/c;->A()V

    return-void
.end method

.method private t(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const-string v1, "text label?"

    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method

.method private u(Lq8/i$c;)V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    const/16 v2, 0x15

    if-le v0, v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    new-instance v3, Landroid/app/ActivityManager$TaskDescription;

    iget-object v4, p1, Lq8/i$c;->b:Ljava/lang/String;

    const/4 v5, 0x0

    iget v6, p1, Lq8/i$c;->a:I

    invoke-direct {v3, v4, v5, v6}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    :cond_0
    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/app/ActivityManager$TaskDescription;

    iget-object v1, p1, Lq8/i$c;->b:Ljava/lang/String;

    const/4 v2, 0x0

    iget p1, p1, Lq8/i$c;->a:I

    invoke-direct {v0, v1, v2, p1}, Landroid/app/ActivityManager$TaskDescription;-><init>(Ljava/lang/String;II)V

    iget-object p1, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTaskDescription(Landroid/app/ActivityManager$TaskDescription;)V

    :cond_1
    return-void
.end method

.method private v()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lio/flutter/plugin/platform/c$b;

    invoke-direct {v1, p0, v0}, Lio/flutter/plugin/platform/c$b;-><init>(Lio/flutter/plugin/platform/c;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method

.method private w(Lq8/i$k;)V
    .locals 1

    sget-object v0, Lq8/i$k;->k:Lq8/i$k;

    if-ne p1, v0, :cond_0

    const/16 p1, 0x706

    goto :goto_0

    :cond_0
    sget-object v0, Lq8/i$k;->l:Lq8/i$k;

    if-ne p1, v0, :cond_1

    const/16 p1, 0xf06

    goto :goto_0

    :cond_1
    sget-object v0, Lq8/i$k;->m:Lq8/i$k;

    if-ne p1, v0, :cond_2

    const/16 p1, 0x1706

    goto :goto_0

    :cond_2
    sget-object v0, Lq8/i$k;->n:Lq8/i$k;

    if-ne p1, v0, :cond_3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_3

    const/16 p1, 0x700

    :goto_0
    iput p1, p0, Lio/flutter/plugin/platform/c;->e:I

    invoke-virtual {p0}, Lio/flutter/plugin/platform/c;->A()V

    :cond_3
    return-void
.end method

.method private x(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq8/i$l;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x1706

    goto :goto_0

    :cond_0
    const/16 v0, 0x706

    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq8/i$l;

    sget-object v3, Lio/flutter/plugin/platform/c$c;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_2

    :cond_1
    and-int/lit16 v0, v0, -0x201

    and-int/lit8 v0, v0, -0x3

    goto :goto_2

    :cond_2
    and-int/lit8 v0, v0, -0x5

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iput v0, p0, Lio/flutter/plugin/platform/c;->e:I

    invoke-virtual {p0}, Lio/flutter/plugin/platform/c;->A()V

    return-void
.end method

.method private y(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method private z(Lq8/i$j;)V
    .locals 9

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    new-instance v2, Landroidx/core/view/e0;

    invoke-direct {v2, v0, v1}, Landroidx/core/view/e0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    const/high16 v3, -0x80000000

    invoke-virtual {v0, v3}, Landroid/view/Window;->addFlags(I)V

    const/high16 v3, 0xc000000

    invoke-virtual {v0, v3}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    const/16 v3, 0x17

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v1, v3, :cond_4

    iget-object v3, p1, Lq8/i$j;->b:Lq8/i$d;

    if-eqz v3, :cond_3

    sget-object v7, Lio/flutter/plugin/platform/c$c;->c:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v7, v3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v4}, Landroidx/core/view/e0;->b(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v6}, Landroidx/core/view/e0;->b(Z)V

    :cond_3
    :goto_0
    iget-object v3, p1, Lq8/i$j;->a:Ljava/lang/Integer;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_4
    iget-object v3, p1, Lq8/i$j;->c:Ljava/lang/Boolean;

    const/16 v7, 0x1d

    if-eqz v3, :cond_5

    if-lt v1, v7, :cond_5

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarContrastEnforced(Z)V

    :cond_5
    const/16 v3, 0x1a

    if-lt v1, v3, :cond_9

    iget-object v3, p1, Lq8/i$j;->e:Lq8/i$d;

    if-eqz v3, :cond_8

    sget-object v8, Lio/flutter/plugin/platform/c$c;->c:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v8, v3

    if-eq v3, v6, :cond_7

    if-eq v3, v5, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v2, v4}, Landroidx/core/view/e0;->a(Z)V

    goto :goto_1

    :cond_7
    invoke-virtual {v2, v6}, Landroidx/core/view/e0;->a(Z)V

    :cond_8
    :goto_1
    iget-object v2, p1, Lq8/i$j;->d:Ljava/lang/Integer;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setNavigationBarColor(I)V

    :cond_9
    iget-object v2, p1, Lq8/i$j;->f:Ljava/lang/Integer;

    if-eqz v2, :cond_a

    const/16 v3, 0x1c

    if-lt v1, v3, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/Window;->setNavigationBarDividerColor(I)V

    :cond_a
    iget-object v2, p1, Lq8/i$j;->g:Ljava/lang/Boolean;

    if-eqz v2, :cond_b

    if-lt v1, v7, :cond_b

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarContrastEnforced(Z)V

    :cond_b
    iput-object p1, p0, Lio/flutter/plugin/platform/c;->d:Lq8/i$j;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lio/flutter/plugin/platform/c;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->d:Lq8/i$j;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/c;->z(Lq8/i$j;)V

    :cond_0
    return-void
.end method

.method B(Lq8/i$g;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    sget-object v1, Lio/flutter/plugin/platform/c$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt p1, v1, :cond_3

    const/4 p1, 0x6

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->b:Lq8/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lq8/i;->l(Lq8/i$h;)V

    return-void
.end method
