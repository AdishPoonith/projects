.class public Lio/flutter/view/c;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/view/c$l;,
        Lio/flutter/view/c$j;,
        Lio/flutter/view/c$m;,
        Lio/flutter/view/c$n;,
        Lio/flutter/view/c$o;,
        Lio/flutter/view/c$h;,
        Lio/flutter/view/c$p;,
        Lio/flutter/view/c$f;,
        Lio/flutter/view/c$i;,
        Lio/flutter/view/c$g;,
        Lio/flutter/view/c$k;
    }
.end annotation


# static fields
.field private static final A:I

.field private static B:I

.field private static final z:I


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lq8/a;

.field private final c:Landroid/view/accessibility/AccessibilityManager;

.field private final d:Lio/flutter/view/AccessibilityViewEmbedder;

.field private final e:Lio/flutter/plugin/platform/k;

.field private final f:Landroid/content/ContentResolver;

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/flutter/view/c$l;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lio/flutter/view/c$h;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lio/flutter/view/c$l;

.field private j:Ljava/lang/Integer;

.field private k:Ljava/lang/Integer;

.field private l:I

.field private m:Lio/flutter/view/c$l;

.field private n:Lio/flutter/view/c$l;

.field private o:Lio/flutter/view/c$l;

.field private final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private q:I

.field private r:Ljava/lang/Integer;

.field private s:Lio/flutter/view/c$k;

.field private t:Z

.field private u:Z

.field private final v:Lq8/a$b;

.field private final w:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private final x:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

.field private final y:Landroid/database/ContentObserver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    iget v0, v0, Lio/flutter/view/c$g;->j:I

    sget-object v1, Lio/flutter/view/c$g;->m:Lio/flutter/view/c$g;

    iget v1, v1, Lio/flutter/view/c$g;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$g;->o:Lio/flutter/view/c$g;

    iget v1, v1, Lio/flutter/view/c$g;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$g;->p:Lio/flutter/view/c$g;

    iget v1, v1, Lio/flutter/view/c$g;->j:I

    or-int/2addr v0, v1

    sput v0, Lio/flutter/view/c;->z:I

    sget-object v0, Lio/flutter/view/c$i;->k:Lio/flutter/view/c$i;

    iget v0, v0, Lio/flutter/view/c$i;->j:I

    sget-object v1, Lio/flutter/view/c$i;->l:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->m:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->o:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->p:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->q:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->r:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->s:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->A:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->B:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->F:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sget-object v1, Lio/flutter/view/c$i;->H:Lio/flutter/view/c$i;

    iget v1, v1, Lio/flutter/view/c$i;->j:I

    or-int/2addr v0, v1

    sput v0, Lio/flutter/view/c;->A:I

    const v0, 0xff00001

    sput v0, Lio/flutter/view/c;->B:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lq8/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/plugin/platform/k;)V
    .locals 7

    new-instance v5, Lio/flutter/view/AccessibilityViewEmbedder;

    const/high16 v0, 0x10000

    invoke-direct {v5, p1, v0}, Lio/flutter/view/AccessibilityViewEmbedder;-><init>(Landroid/view/View;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lio/flutter/view/c;-><init>(Landroid/view/View;Lq8/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/view/AccessibilityViewEmbedder;Lio/flutter/plugin/platform/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lq8/a;Landroid/view/accessibility/AccessibilityManager;Landroid/content/ContentResolver;Lio/flutter/view/AccessibilityViewEmbedder;Lio/flutter/plugin/platform/k;)V
    .locals 4

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/view/c;->h:Ljava/util/Map;

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/view/c;->l:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lio/flutter/view/c;->p:Ljava/util/List;

    iput v0, p0, Lio/flutter/view/c;->q:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lio/flutter/view/c;->r:Ljava/lang/Integer;

    iput-boolean v0, p0, Lio/flutter/view/c;->t:Z

    iput-boolean v0, p0, Lio/flutter/view/c;->u:Z

    new-instance v1, Lio/flutter/view/c$a;

    invoke-direct {v1, p0}, Lio/flutter/view/c$a;-><init>(Lio/flutter/view/c;)V

    iput-object v1, p0, Lio/flutter/view/c;->v:Lq8/a$b;

    new-instance v1, Lio/flutter/view/c$b;

    invoke-direct {v1, p0}, Lio/flutter/view/c$b;-><init>(Lio/flutter/view/c;)V

    iput-object v1, p0, Lio/flutter/view/c;->w:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    new-instance v2, Lio/flutter/view/c$c;

    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    invoke-direct {v2, p0, v3}, Lio/flutter/view/c$c;-><init>(Lio/flutter/view/c;Landroid/os/Handler;)V

    iput-object v2, p0, Lio/flutter/view/c;->y:Landroid/database/ContentObserver;

    iput-object p1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    iput-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    iput-object p3, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    iput-object p4, p0, Lio/flutter/view/c;->f:Landroid/content/ContentResolver;

    iput-object p5, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    iput-object p6, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    invoke-interface {v1, p1}, Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;->onAccessibilityStateChanged(Z)V

    invoke-virtual {p3, v1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance p2, Lio/flutter/view/c$d;

    invoke-direct {p2, p0, p3}, Lio/flutter/view/c$d;-><init>(Lio/flutter/view/c;Landroid/view/accessibility/AccessibilityManager;)V

    iput-object p2, p0, Lio/flutter/view/c;->x:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p5

    invoke-interface {p2, p5}, Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;->onTouchExplorationStateChanged(Z)V

    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    invoke-virtual {v2, v0}, Landroid/database/ContentObserver;->onChange(Z)V

    const-string p2, "transition_animation_scale"

    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p4, p2, v0, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    invoke-direct {p0}, Lio/flutter/view/c;->X()V

    :cond_0
    invoke-interface {p6, p0}, Lio/flutter/plugin/platform/k;->a(Lio/flutter/view/c;)V

    return-void
.end method

.method private A(I)Lio/flutter/view/c$l;
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/c$l;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/view/c$l;

    invoke-direct {v0, p0}, Lio/flutter/view/c$l;-><init>(Lio/flutter/view/c;)V

    invoke-static {v0, p1}, Lio/flutter/view/c$l;->b(Lio/flutter/view/c$l;I)I

    iget-object v1, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private B()Lio/flutter/view/c$l;
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/c$l;

    return-object v0
.end method

.method private C(FFZ)V
    .locals 3

    iget-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/flutter/view/c;->B()Lio/flutter/view/c$l;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    const/4 p1, 0x2

    const/4 p2, 0x0

    aput p2, v1, p1

    const/4 p1, 0x3

    const/high16 p2, 0x3f800000    # 1.0f

    aput p2, v1, p1

    invoke-static {v0, v1, p3}, Lio/flutter/view/c$l;->J(Lio/flutter/view/c$l;[FZ)Lio/flutter/view/c$l;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    if-eq p1, p2, :cond_3

    if-eqz p1, :cond_1

    invoke-static {p1}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p2

    const/16 p3, 0x80

    invoke-direct {p0, p2, p3}, Lio/flutter/view/c;->R(II)V

    :cond_1
    iget-object p2, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    if-eqz p2, :cond_2

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p2

    const/16 p3, 0x100

    invoke-direct {p0, p2, p3}, Lio/flutter/view/c;->R(II)V

    :cond_2
    iput-object p1, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    :cond_3
    return-void
.end method

.method private static synthetic F(Lio/flutter/view/c$l;Lio/flutter/view/c$l;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic G(Lio/flutter/view/c$l;)Z
    .locals 1

    sget-object v0, Lio/flutter/view/c$i;->C:Lio/flutter/view/c$i;

    invoke-static {p0, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result p0

    return p0
.end method

.method private H(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setSource(Landroid/view/View;I)V

    return-object p2
.end method

.method private L()V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    const/16 v1, 0x100

    invoke-direct {p0, v0, v1}, Lio/flutter/view/c;->R(II)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    :cond_0
    return-void
.end method

.method private M(Lio/flutter/view/c$l;)V
    .locals 3

    invoke-static {p1}, Lio/flutter/view/c$l;->d0(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, " "

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    invoke-direct {p0, v0}, Lio/flutter/view/c;->V(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p1

    const/16 v1, 0x20

    invoke-direct {p0, p1, v1}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_0
    return-void
.end method

.method private N(Lio/flutter/view/c$l;ILandroid/os/Bundle;Z)Z
    .locals 4

    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    invoke-static {p1}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v2

    invoke-direct {p0, p1, v0, p4, p3}, Lio/flutter/view/c;->P(Lio/flutter/view/c$l;IZZ)V

    invoke-static {p1}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v3

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v1

    if-eq v2, v1, :cond_2

    :cond_0
    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    invoke-static {p1}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v2

    const/16 v3, 0x2000

    invoke-direct {p0, v2, v3}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    invoke-direct {p0, v2}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_2
    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 p1, 0x4

    if-eq v0, p1, :cond_3

    const/16 p1, 0x8

    if-eq v0, p1, :cond_3

    const/16 p1, 0x10

    if-eq v0, p1, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    if-eqz p4, :cond_5

    sget-object v0, Lio/flutter/view/c$g;->D:Lio/flutter/view/c$g;

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, v0, p3}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return v1

    :cond_5
    if-nez p4, :cond_8

    sget-object p4, Lio/flutter/view/c$g;->E:Lio/flutter/view/c$g;

    invoke-static {p1, p4}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return v1

    :cond_6
    if-eqz p4, :cond_7

    sget-object v0, Lio/flutter/view/c$g;->t:Lio/flutter/view/c$g;

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object p1, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, v0, p3}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return v1

    :cond_7
    if-nez p4, :cond_8

    sget-object p4, Lio/flutter/view/c$g;->u:Lio/flutter/view/c$g;

    invoke-static {p1, p4}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return v1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method private O(Lio/flutter/view/c$l;ILandroid/os/Bundle;)Z
    .locals 2

    if-eqz p3, :cond_0

    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const-string p3, ""

    :goto_0
    iget-object v0, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object v1, Lio/flutter/view/c$g;->F:Lio/flutter/view/c$g;

    invoke-virtual {v0, p2, v1, p3}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    invoke-static {p1, p3}, Lio/flutter/view/c$l;->r(Lio/flutter/view/c$l;Ljava/lang/String;)Ljava/lang/String;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lio/flutter/view/c$l;->F(Lio/flutter/view/c$l;Ljava/util/List;)Ljava/util/List;

    const/4 p1, 0x1

    return p1
.end method

.method private P(Lio/flutter/view/c$l;IZZ)V
    .locals 3

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v0

    if-ltz v0, :cond_b

    invoke-static {p1}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v0

    if-gez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x1

    if-eq p2, v0, :cond_8

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p2, v1, :cond_6

    const/4 v1, 0x4

    if-eq p2, v1, :cond_4

    const/16 v0, 0x8

    if-eq p2, v0, :cond_1

    const/16 v0, 0x10

    if-eq p2, v0, :cond_1

    goto/16 :goto_3

    :cond_1
    if-eqz p3, :cond_3

    :cond_2
    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    :goto_0
    invoke-static {p1, p2}, Lio/flutter/view/c$l;->l(Lio/flutter/view/c$l;I)I

    goto/16 :goto_3

    :cond_3
    invoke-static {p1, v2}, Lio/flutter/view/c$l;->l(Lio/flutter/view/c$l;I)I

    goto/16 :goto_3

    :cond_4
    if-eqz p3, :cond_5

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_5

    const-string p2, "(?!^)(\\n)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_2

    :goto_1
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/c$l;->m(Lio/flutter/view/c$l;I)I

    goto/16 :goto_3

    :cond_5
    if-nez p3, :cond_a

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    if-lez p2, :cond_a

    const-string p2, "(?s:.*)(\\n)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_3

    :goto_2
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    goto :goto_0

    :cond_6
    if-eqz p3, :cond_7

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_7

    const-string p2, "\\p{L}(\\b)"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_7
    if-nez p3, :cond_a

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    if-lez p2, :cond_a

    const-string p2, "(?s:.*)(\\b)\\p{L}"

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_a

    goto :goto_2

    :cond_8
    if-eqz p3, :cond_9

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    invoke-static {p1}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p2, v1, :cond_9

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->m(Lio/flutter/view/c$l;I)I

    goto :goto_3

    :cond_9
    if-nez p3, :cond_a

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    if-lez p2, :cond_a

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->n(Lio/flutter/view/c$l;I)I

    :cond_a
    :goto_3
    if-nez p4, :cond_b

    invoke-static {p1}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/c$l;->j(Lio/flutter/view/c$l;I)I

    :cond_b
    :goto_4
    return-void
.end method

.method private R(II)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method private S(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-interface {v0, v1, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method private T()V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->b:Lq8/a;

    iget v1, p0, Lio/flutter/view/c;->l:I

    invoke-virtual {v0, v1}, Lq8/a;->f(I)V

    return-void
.end method

.method private U(I)V
    .locals 1

    const/16 v0, 0x800

    invoke-direct {p0, p1, v0}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    invoke-direct {p0, p1}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method private V(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAccessibilityPaneTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private W(Z)V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/view/c;->t:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/view/c;->t:Z

    if-eqz p1, :cond_1

    iget p1, p0, Lio/flutter/view/c;->l:I

    sget-object v0, Lio/flutter/view/c$f;->k:Lio/flutter/view/c$f;

    iget v0, v0, Lio/flutter/view/c$f;->j:I

    or-int/2addr p1, v0

    goto :goto_0

    :cond_1
    iget p1, p0, Lio/flutter/view/c;->l:I

    sget-object v0, Lio/flutter/view/c$f;->k:Lio/flutter/view/c$f;

    iget v0, v0, Lio/flutter/view/c$f;->j:I

    not-int v0, v0

    and-int/2addr p1, v0

    :goto_0
    iput p1, p0, Lio/flutter/view/c;->l:I

    invoke-direct {p0}, Lio/flutter/view/c;->T()V

    return-void
.end method

.method private X()V
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontWeightAdjustment:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_1

    const/16 v1, 0x12c

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget v0, p0, Lio/flutter/view/c;->l:I

    sget-object v1, Lio/flutter/view/c$f;->n:Lio/flutter/view/c$f;

    iget v1, v1, Lio/flutter/view/c$f;->j:I

    or-int/2addr v0, v1

    goto :goto_1

    :cond_2
    iget v0, p0, Lio/flutter/view/c;->l:I

    sget-object v1, Lio/flutter/view/c$f;->n:Lio/flutter/view/c$f;

    iget v1, v1, Lio/flutter/view/c$f;->j:I

    and-int/2addr v0, v1

    :goto_1
    iput v0, p0, Lio/flutter/view/c;->l:I

    invoke-direct {p0}, Lio/flutter/view/c;->T()V

    :cond_3
    :goto_2
    return-void
.end method

.method private Z(Lio/flutter/view/c$l;)Z
    .locals 2

    invoke-static {p1}, Lio/flutter/view/c$l;->c(Lio/flutter/view/c$l;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    new-instance v1, Lio/flutter/view/a;

    invoke-direct {v1, p1}, Lio/flutter/view/a;-><init>(Lio/flutter/view/c$l;)V

    invoke-static {v0, v1}, Lio/flutter/view/c$l;->d(Lio/flutter/view/c$l;Lf9/d;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    sget-object v0, Lio/flutter/view/b;->a:Lio/flutter/view/b;

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->d(Lio/flutter/view/c$l;Lf9/d;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic a(Lio/flutter/view/c$l;)Z
    .locals 0

    invoke-static {p0}, Lio/flutter/view/c;->G(Lio/flutter/view/c$l;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/flutter/view/c$l;Lio/flutter/view/c$l;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/view/c;->F(Lio/flutter/view/c$l;Lio/flutter/view/c$l;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(Lio/flutter/view/c;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    return-object p0
.end method

.method private c0(Lio/flutter/view/c$l;)V
    .locals 6

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/flutter/view/c$l;->u(Lio/flutter/view/c$l;Lio/flutter/view/c$l;)Lio/flutter/view/c$l;

    invoke-static {p1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v1

    const/high16 v2, 0x10000

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    iget-object v1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    iget-object v4, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Lio/flutter/view/AccessibilityViewEmbedder;->platformViewOfNode(I)Landroid/view/View;

    move-result-object v1

    iget-object v4, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {p1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v5

    invoke-interface {v4, v5}, Lio/flutter/plugin/platform/k;->c(I)Landroid/view/View;

    move-result-object v4

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1, v2}, Lio/flutter/view/c;->R(II)V

    iput-object v0, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    :cond_0
    invoke-static {p1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v1

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {p1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v3

    invoke-interface {v1, v3}, Lio/flutter/plugin/platform/k;->c(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_1
    iget-object v1, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-ne v1, p1, :cond_2

    invoke-static {v1}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-direct {p0, v1, v2}, Lio/flutter/view/c;->R(II)V

    iput-object v0, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    :cond_2
    iget-object v1, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-ne v1, p1, :cond_3

    iput-object v0, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    :cond_3
    iget-object v1, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    if-ne v1, p1, :cond_4

    iput-object v0, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    :cond_4
    return-void
.end method

.method static synthetic d(Lio/flutter/view/c;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    return-object p0
.end method

.method static synthetic e(Lio/flutter/view/c;)Landroid/content/ContentResolver;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->f:Landroid/content/ContentResolver;

    return-object p0
.end method

.method static synthetic f(Lio/flutter/view/c;I)I
    .locals 1

    iget v0, p0, Lio/flutter/view/c;->l:I

    and-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/c;->l:I

    return p1
.end method

.method static synthetic g(Lio/flutter/view/c;I)I
    .locals 1

    iget v0, p0, Lio/flutter/view/c;->l:I

    or-int/2addr p1, v0

    iput p1, p0, Lio/flutter/view/c;->l:I

    return p1
.end method

.method static synthetic h(Lio/flutter/view/c;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/view/c;->T()V

    return-void
.end method

.method static synthetic i(Lio/flutter/view/c;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/view/c;->L()V

    return-void
.end method

.method static synthetic j(Lio/flutter/view/c;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/view/c;->R(II)V

    return-void
.end method

.method static synthetic k(Lio/flutter/view/c;II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lio/flutter/view/c;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method static synthetic m(Lio/flutter/view/c;)Z
    .locals 0

    iget-boolean p0, p0, Lio/flutter/view/c;->u:Z

    return p0
.end method

.method static synthetic n(Lio/flutter/view/c;)Lq8/a$b;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->v:Lq8/a$b;

    return-object p0
.end method

.method static synthetic o(Lio/flutter/view/c;I)Lio/flutter/view/c$l;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/view/c;->A(I)Lio/flutter/view/c$l;

    move-result-object p0

    return-object p0
.end method

.method static synthetic p(Lio/flutter/view/c;)Lq8/a;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->b:Lq8/a;

    return-object p0
.end method

.method static synthetic q(Lio/flutter/view/c;I)Lio/flutter/view/c$h;
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/view/c;->z(I)Lio/flutter/view/c$h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r()I
    .locals 1

    sget v0, Lio/flutter/view/c;->z:I

    return v0
.end method

.method static synthetic s()I
    .locals 1

    sget v0, Lio/flutter/view/c;->A:I

    return v0
.end method

.method static synthetic t(Lio/flutter/view/c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/view/c;->W(Z)V

    return-void
.end method

.method static synthetic u(Lio/flutter/view/c;)Lio/flutter/view/c$k;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/c;->s:Lio/flutter/view/c$k;

    return-object p0
.end method

.method private v(ILjava/lang/String;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 5

    const/16 v0, 0x10

    invoke-direct {p0, p1, v0}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setBeforeText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-lt v1, v0, :cond_4

    if-lt v2, v0, :cond_4

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setRemovedCount(I)V

    sub-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAddedCount(I)V

    return-object p1
.end method

.method private w()Z
    .locals 3

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lf9/h;->e(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    if-nez v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private y(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    aget v1, p1, v1

    const/4 v2, 0x1

    aget p1, p1, v2

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Rect;->offset(II)V

    return-object v0
.end method

.method private z(I)Lio/flutter/view/c$h;
    .locals 2

    iget-object v0, p0, Lio/flutter/view/c;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/c$h;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/view/c$h;

    invoke-direct {v0}, Lio/flutter/view/c$h;-><init>()V

    invoke-static {v0, p1}, Lio/flutter/view/c$h;->h(Lio/flutter/view/c$h;I)I

    sget v1, Lio/flutter/view/c;->B:I

    add-int/2addr v1, p1

    invoke-static {v0, v1}, Lio/flutter/view/c$h;->d(Lio/flutter/view/c$h;I)I

    iget-object v1, p0, Lio/flutter/view/c;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public D()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public E()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    return v0
.end method

.method public I(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    invoke-static {p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method

.method public J(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/flutter/view/c;->K(Landroid/view/MotionEvent;Z)Z

    move-result p1

    return p1
.end method

.method public K(Landroid/view/MotionEvent;Z)Z
    .locals 6

    iget-object v0, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, Lio/flutter/view/c;->B()Lio/flutter/view/c$l;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    aput v3, v2, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v4, 0x1

    aput v3, v2, v4

    const/4 v3, 0x2

    const/4 v5, 0x0

    aput v5, v2, v3

    const/4 v3, 0x3

    const/high16 v5, 0x3f800000    # 1.0f

    aput v5, v2, v3

    invoke-static {v0, v2, p2}, Lio/flutter/view/c$l;->J(Lio/flutter/view/c$l;[FZ)Lio/flutter/view/c$l;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    if-eqz p2, :cond_2

    return v1

    :cond_2
    iget-object p2, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    invoke-virtual {p2, v0, p1}, Lio/flutter/view/AccessibilityViewEmbedder;->onAccessibilityHoverEvent(ILandroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v2, 0x9

    if-eq v0, v2, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x7

    if-ne v0, v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    const/16 v0, 0xa

    if-ne p2, v0, :cond_5

    invoke-direct {p0}, Lio/flutter/view/c;->L()V

    goto :goto_1

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unexpected accessibility hover event: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "flutter"

    invoke-static {p2, p1}, Ld8/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_6
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, v0, p1, p2}, Lio/flutter/view/c;->C(FFZ)V

    :goto_1
    return v4
.end method

.method public Q()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/view/c;->u:Z

    iget-object v0, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-interface {v0}, Lio/flutter/plugin/platform/k;->d()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/flutter/view/c;->Y(Lio/flutter/view/c$k;)V

    iget-object v1, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    iget-object v2, p0, Lio/flutter/view/c;->w:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z

    iget-object v1, p0, Lio/flutter/view/c;->c:Landroid/view/accessibility/AccessibilityManager;

    iget-object v2, p0, Lio/flutter/view/c;->x:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    iget-object v1, p0, Lio/flutter/view/c;->f:Landroid/content/ContentResolver;

    iget-object v2, p0, Lio/flutter/view/c;->y:Landroid/database/ContentObserver;

    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    iget-object v1, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-virtual {v1, v0}, Lq8/a;->g(Lq8/a$b;)V

    return-void
.end method

.method public Y(Lio/flutter/view/c$k;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/c;->s:Lio/flutter/view/c$k;

    return-void
.end method

.method a0(Ljava/nio/ByteBuffer;[Ljava/lang/String;)V
    .locals 4

    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    invoke-direct {p0, v0}, Lio/flutter/view/c;->z(I)Lio/flutter/view/c$h;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-static {v0, v1}, Lio/flutter/view/c$h;->j(Lio/flutter/view/c$h;I)I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    move-object v1, v2

    goto :goto_1

    :cond_0
    aget-object v1, p2, v1

    :goto_1
    invoke-static {v0, v1}, Lio/flutter/view/c$h;->f(Lio/flutter/view/c$h;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    if-ne v1, v3, :cond_1

    goto :goto_2

    :cond_1
    aget-object v2, p2, v1

    :goto_2
    invoke-static {v0, v2}, Lio/flutter/view/c$h;->b(Lio/flutter/view/c$h;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_2
    return-void
.end method

.method b0(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    invoke-direct {p0, v1}, Lio/flutter/view/c;->A(I)Lio/flutter/view/c$l;

    move-result-object v1

    invoke-static {v1, p1, p2, p3}, Lio/flutter/view/c$l;->K(Lio/flutter/view/c$l;Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V

    sget-object v3, Lio/flutter/view/c$i;->x:Lio/flutter/view/c$i;

    invoke-static {v1, v3}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lio/flutter/view/c$i;->p:Lio/flutter/view/c$i;

    invoke-static {v1, v3}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v3

    if-eqz v3, :cond_2

    iput-object v1, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    :cond_2
    invoke-static {v1}, Lio/flutter/view/c$l;->L(Lio/flutter/view/c$l;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    iget-object v3, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v4

    invoke-interface {v3, v4}, Lio/flutter/plugin/platform/k;->b(I)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v1}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v1

    invoke-interface {v3, v1}, Lio/flutter/plugin/platform/k;->c(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0}, Lio/flutter/view/c;->B()Lio/flutter/view/c$l;

    move-result-object p2

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    if-eqz p2, :cond_8

    const/16 v3, 0x10

    new-array v3, v3, [F

    invoke-static {v3, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_7

    const/16 v5, 0x1c

    if-lt v4, v5, :cond_5

    invoke-direct {p0}, Lio/flutter/view/c;->w()Z

    move-result v4

    goto :goto_1

    :cond_5
    const/4 v4, 0x1

    :goto_1
    if-eqz v4, :cond_7

    iget-object v4, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v4

    if-eqz v4, :cond_7

    iget-object v5, p0, Lio/flutter/view/c;->r:Ljava/lang/Integer;

    invoke-virtual {v4}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-static {p2, v1}, Lio/flutter/view/c$l;->M(Lio/flutter/view/c$l;Z)Z

    invoke-static {p2, v1}, Lio/flutter/view/c$l;->N(Lio/flutter/view/c$l;Z)Z

    :cond_6
    invoke-virtual {v4}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, p0, Lio/flutter/view/c;->r:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-static {v3, v2, v4, v5, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    :cond_7
    invoke-static {p2, v3, p1, v2}, Lio/flutter/view/c$l;->O(Lio/flutter/view/c$l;[FLjava/util/Set;Z)V

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->P(Lio/flutter/view/c$l;Ljava/util/List;)V

    :cond_8
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    move-object v4, v3

    :cond_9
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/view/c$l;

    iget-object v6, p0, Lio/flutter/view/c;->p:Ljava/util/List;

    invoke-static {v5}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    move-object v4, v5

    goto :goto_2

    :cond_a
    if-nez v4, :cond_b

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-lez p2, :cond_b

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v1

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lio/flutter/view/c$l;

    :cond_b
    if-eqz v4, :cond_d

    invoke-static {v4}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p2

    iget v5, p0, Lio/flutter/view/c;->q:I

    if-ne p2, v5, :cond_c

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    iget-object v5, p0, Lio/flutter/view/c;->p:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-eq p2, v5, :cond_d

    :cond_c
    invoke-static {v4}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p2

    iput p2, p0, Lio/flutter/view/c;->q:I

    invoke-direct {p0, v4}, Lio/flutter/view/c;->M(Lio/flutter/view/c$l;)V

    :cond_d
    iget-object p2, p0, Lio/flutter/view/c;->p:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/flutter/view/c$l;

    iget-object v4, p0, Lio/flutter/view/c;->p:Ljava/util/List;

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v4, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_e
    iget-object p2, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_f
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_10

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/flutter/view/c$l;

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-direct {p0, p3}, Lio/flutter/view/c;->c0(Lio/flutter/view/c$l;)V

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    :cond_10
    invoke-direct {p0, v2}, Lio/flutter/view/c;->U(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_28

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/view/c$l;

    invoke-static {p2}, Lio/flutter/view/c$l;->Q(Lio/flutter/view/c$l;)Z

    move-result p3

    if-eqz p3, :cond_1d

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    const/16 v0, 0x1000

    invoke-direct {p0, p3, v0}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p3

    invoke-static {p2}, Lio/flutter/view/c$l;->R(Lio/flutter/view/c$l;)F

    move-result v0

    invoke-static {p2}, Lio/flutter/view/c$l;->S(Lio/flutter/view/c$l;)F

    move-result v4

    invoke-static {p2}, Lio/flutter/view/c$l;->S(Lio/flutter/view/c$l;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    const v6, 0x4788b800    # 70000.0f

    const v7, 0x47c35000    # 100000.0f

    if-eqz v5, :cond_13

    cmpl-float v4, v0, v6

    if-lez v4, :cond_12

    const v0, 0x4788b800    # 70000.0f

    :cond_12
    const v4, 0x47c35000    # 100000.0f

    :cond_13
    invoke-static {p2}, Lio/flutter/view/c$l;->T(Lio/flutter/view/c$l;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-eqz v5, :cond_15

    add-float/2addr v4, v7

    const v5, -0x38774800    # -70000.0f

    cmpg-float v6, v0, v5

    if-gez v6, :cond_14

    const v0, -0x38774800    # -70000.0f

    :cond_14
    add-float/2addr v0, v7

    goto :goto_6

    :cond_15
    invoke-static {p2}, Lio/flutter/view/c$l;->T(Lio/flutter/view/c$l;)F

    move-result v5

    sub-float/2addr v4, v5

    invoke-static {p2}, Lio/flutter/view/c$l;->T(Lio/flutter/view/c$l;)F

    move-result v5

    sub-float/2addr v0, v5

    :goto_6
    sget-object v5, Lio/flutter/view/c$g;->o:Lio/flutter/view/c$g;

    invoke-static {p2, v5}, Lio/flutter/view/c$l;->U(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v5

    if-nez v5, :cond_18

    sget-object v5, Lio/flutter/view/c$g;->p:Lio/flutter/view/c$g;

    invoke-static {p2, v5}, Lio/flutter/view/c$l;->U(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_7

    :cond_16
    sget-object v5, Lio/flutter/view/c$g;->m:Lio/flutter/view/c$g;

    invoke-static {p2, v5}, Lio/flutter/view/c$l;->U(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v5

    if-nez v5, :cond_17

    sget-object v5, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    invoke-static {p2, v5}, Lio/flutter/view/c$l;->U(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v5

    if-eqz v5, :cond_19

    :cond_17
    float-to-int v0, v0

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollX(I)V

    float-to-int v0, v4

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollX(I)V

    goto :goto_8

    :cond_18
    :goto_7
    float-to-int v0, v0

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollY(I)V

    float-to-int v0, v4

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMaxScrollY(I)V

    :cond_19
    :goto_8
    invoke-static {p2}, Lio/flutter/view/c$l;->c(Lio/flutter/view/c$l;)I

    move-result v0

    if-lez v0, :cond_1c

    invoke-static {p2}, Lio/flutter/view/c$l;->c(Lio/flutter/view/c$l;)I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    invoke-static {p2}, Lio/flutter/view/c$l;->V(Lio/flutter/view/c$l;)I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-static {p2}, Lio/flutter/view/c$l;->W(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :cond_1a
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/view/c$l;

    sget-object v6, Lio/flutter/view/c$i;->x:Lio/flutter/view/c$i;

    invoke-static {v5, v6}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v5

    if-nez v5, :cond_1a

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_1b
    invoke-static {p2}, Lio/flutter/view/c$l;->V(Lio/flutter/view/c$l;)I

    move-result v0

    add-int/2addr v0, v4

    sub-int/2addr v0, v1

    invoke-virtual {p3, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    :cond_1c
    invoke-direct {p0, p3}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_1d
    sget-object p3, Lio/flutter/view/c$i;->z:Lio/flutter/view/c$i;

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result p3

    if-eqz p3, :cond_1e

    invoke-static {p2}, Lio/flutter/view/c$l;->X(Lio/flutter/view/c$l;)Z

    move-result p3

    if-eqz p3, :cond_1e

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-direct {p0, p3}, Lio/flutter/view/c;->U(I)V

    :cond_1e
    iget-object p3, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz p3, :cond_1f

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-ne p3, v0, :cond_1f

    sget-object p3, Lio/flutter/view/c$i;->m:Lio/flutter/view/c$i;

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->Y(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result p3

    if-eqz p3, :cond_1f

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    const/4 v0, 0x4

    invoke-direct {p0, p3, v0}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    invoke-static {p2}, Lio/flutter/view/c$l;->Z(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p3}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_1f
    iget-object p3, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-eqz p3, :cond_21

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-ne p3, v0, :cond_21

    iget-object p3, p0, Lio/flutter/view/c;->n:Lio/flutter/view/c$l;

    if-eqz p3, :cond_20

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    iget-object v0, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-eq p3, v0, :cond_21

    :cond_20
    iget-object p3, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    iput-object p3, p0, Lio/flutter/view/c;->n:Lio/flutter/view/c$l;

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    const/16 v0, 0x8

    invoke-direct {p0, p3, v0}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p3

    invoke-direct {p0, p3}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_a

    :cond_21
    iget-object p3, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-nez p3, :cond_22

    iput-object v3, p0, Lio/flutter/view/c;->n:Lio/flutter/view/c$l;

    :cond_22
    :goto_a
    iget-object p3, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-eqz p3, :cond_11

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-ne p3, v0, :cond_11

    sget-object p3, Lio/flutter/view/c$i;->o:Lio/flutter/view/c$i;

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->Y(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p2, p3}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result p3

    if-eqz p3, :cond_11

    iget-object p3, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz p3, :cond_23

    invoke-static {p3}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    iget-object v0, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-ne p3, v0, :cond_11

    :cond_23
    invoke-static {p2}, Lio/flutter/view/c$l;->a0(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    const-string v0, ""

    if-eqz p3, :cond_24

    invoke-static {p2}, Lio/flutter/view/c$l;->a0(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    goto :goto_b

    :cond_24
    move-object p3, v0

    :goto_b
    invoke-static {p2}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_25

    invoke-static {p2}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v0

    :cond_25
    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v4

    invoke-direct {p0, v4, p3, v0}, Lio/flutter/view/c;->v(ILjava/lang/String;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p3

    if-eqz p3, :cond_26

    invoke-direct {p0, p3}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_26
    invoke-static {p2}, Lio/flutter/view/c$l;->b0(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p2}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v4

    if-ne p3, v4, :cond_27

    invoke-static {p2}, Lio/flutter/view/c$l;->c0(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p2}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v4

    if-eq p3, v4, :cond_11

    :cond_27
    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p3

    const/16 v4, 0x2000

    invoke-direct {p0, p3, v4}, Lio/flutter/view/c;->H(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v4

    invoke-virtual {p3, v4}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    invoke-static {p2}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    invoke-direct {p0, p3}, Lio/flutter/view/c;->S(Landroid/view/accessibility/AccessibilityEvent;)V

    goto/16 :goto_5

    :cond_28
    return-void
.end method

.method public createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 13

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lio/flutter/view/c;->W(Z)V

    const/high16 v1, 0x10000

    if-lt p1, v1, :cond_0

    iget-object v0, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v0, p1}, Lio/flutter/view/AccessibilityViewEmbedder;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p1, v2, :cond_2

    iget-object p1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {p1, v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    :cond_1
    return-object p1

    :cond_2
    iget-object v4, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/view/c$l;

    const/4 v5, 0x0

    if-nez v4, :cond_3

    return-object v5

    :cond_3
    invoke-static {v4}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v6

    if-eq v6, v2, :cond_5

    iget-object v6, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v4}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v7

    invoke-interface {v6, v7}, Lio/flutter/plugin/platform/k;->b(I)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object p1, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v4}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v0

    invoke-interface {p1, v0}, Lio/flutter/plugin/platform/k;->c(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_4

    return-object v5

    :cond_4
    invoke-static {v4}, Lio/flutter/view/c$l;->f(Lio/flutter/view/c$l;)Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-static {v4}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v2

    invoke-virtual {v1, p1, v2, v0}, Lio/flutter/view/AccessibilityViewEmbedder;->getRootNode(Landroid/view/View;ILandroid/graphics/Rect;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object v5, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {p0, v5, p1}, Lio/flutter/view/c;->I(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v7, ""

    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    iget-object v8, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    const-string v8, "android.view.View"

    invoke-virtual {v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    iget-object v8, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v5, v8, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    invoke-static {v4}, Lio/flutter/view/c$l;->g(Lio/flutter/view/c$l;)Z

    move-result v8

    invoke-virtual {v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    iget-object v8, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-eqz v8, :cond_7

    invoke-static {v8}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v8

    if-ne v8, p1, :cond_6

    const/4 v8, 0x1

    goto :goto_0

    :cond_6
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    :cond_7
    iget-object v8, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz v8, :cond_9

    invoke-static {v8}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v8

    if-ne v8, p1, :cond_8

    const/4 v8, 0x1

    goto :goto_1

    :cond_8
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    :cond_9
    sget-object v8, Lio/flutter/view/c$i;->o:Lio/flutter/view/c$i;

    invoke-static {v4, v8}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v9

    if-eqz v9, :cond_12

    sget-object v9, Lio/flutter/view/c$i;->u:Lio/flutter/view/c$i;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v9

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    sget-object v9, Lio/flutter/view/c$i;->E:Lio/flutter/view/c$i;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v10

    if-nez v10, :cond_a

    const-string v10, "android.widget.EditText"

    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_a
    invoke-static {v4, v9}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v9

    xor-int/2addr v9, v0

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    invoke-static {v4}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v9

    if-eq v9, v2, :cond_b

    invoke-static {v4}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v9

    if-eq v9, v2, :cond_b

    invoke-static {v4}, Lio/flutter/view/c$l;->i(Lio/flutter/view/c$l;)I

    move-result v9

    invoke-static {v4}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result v10

    invoke-virtual {v5, v9, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    :cond_b
    iget-object v9, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz v9, :cond_c

    invoke-static {v9}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v9

    if-ne v9, p1, :cond_c

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    :cond_c
    sget-object v9, Lio/flutter/view/c$g;->t:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    const/16 v10, 0x100

    if-eqz v9, :cond_d

    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    const/4 v9, 0x1

    goto :goto_2

    :cond_d
    const/4 v9, 0x0

    :goto_2
    sget-object v11, Lio/flutter/view/c$g;->u:Lio/flutter/view/c$g;

    invoke-static {v4, v11}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v11

    const/16 v12, 0x200

    if-eqz v11, :cond_e

    invoke-virtual {v5, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    or-int/lit8 v9, v9, 0x1

    :cond_e
    sget-object v11, Lio/flutter/view/c$g;->D:Lio/flutter/view/c$g;

    invoke-static {v4, v11}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    or-int/lit8 v9, v9, 0x2

    :cond_f
    sget-object v10, Lio/flutter/view/c$g;->E:Lio/flutter/view/c$g;

    invoke-static {v4, v10}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-virtual {v5, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    or-int/lit8 v9, v9, 0x2

    :cond_10
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    invoke-static {v4}, Lio/flutter/view/c$l;->p(Lio/flutter/view/c$l;)I

    move-result v9

    if-ltz v9, :cond_12

    invoke-static {v4}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_11

    const/4 v9, 0x0

    goto :goto_3

    :cond_11
    invoke-static {v4}, Lio/flutter/view/c$l;->q(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    :goto_3
    invoke-static {v4}, Lio/flutter/view/c$l;->s(Lio/flutter/view/c$l;)I

    invoke-static {v4}, Lio/flutter/view/c$l;->p(Lio/flutter/view/c$l;)I

    invoke-static {v4}, Lio/flutter/view/c$l;->s(Lio/flutter/view/c$l;)I

    move-result v10

    sub-int/2addr v9, v10

    invoke-static {v4}, Lio/flutter/view/c$l;->p(Lio/flutter/view/c$l;)I

    move-result v10

    add-int/2addr v9, v10

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    :cond_12
    sget-object v9, Lio/flutter/view/c$g;->v:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_13

    const/high16 v9, 0x20000

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_13
    sget-object v9, Lio/flutter/view/c$g;->w:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_14

    const/16 v9, 0x4000

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_14
    sget-object v9, Lio/flutter/view/c$g;->x:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_15
    sget-object v1, Lio/flutter/view/c$g;->y:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_16

    const v1, 0x8000

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_16
    sget-object v1, Lio/flutter/view/c$g;->F:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_17

    const/high16 v1, 0x200000

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_17
    sget-object v1, Lio/flutter/view/c$i;->n:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-nez v1, :cond_18

    sget-object v1, Lio/flutter/view/c$i;->G:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_19

    :cond_18
    const-string v1, "android.widget.Button"

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_19
    sget-object v1, Lio/flutter/view/c$i;->y:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_1a

    const-string v1, "android.widget.ImageView"

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_1a
    sget-object v1, Lio/flutter/view/c$g;->C:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDismissable(Z)V

    const/high16 v1, 0x100000

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_1b
    invoke-static {v4}, Lio/flutter/view/c$l;->t(Lio/flutter/view/c$l;)Lio/flutter/view/c$l;

    move-result-object v1

    if-eqz v1, :cond_1c

    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-static {v4}, Lio/flutter/view/c$l;->t(Lio/flutter/view/c$l;)Lio/flutter/view/c$l;

    move-result-object v9

    invoke-static {v9}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v9

    invoke-virtual {v5, v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    goto :goto_4

    :cond_1c
    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    :goto_4
    invoke-static {v4}, Lio/flutter/view/c$l;->v(Lio/flutter/view/c$l;)I

    move-result v1

    if-eq v1, v2, :cond_1d

    const/16 v1, 0x16

    if-lt v6, v1, :cond_1d

    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-static {v4}, Lio/flutter/view/c$l;->v(Lio/flutter/view/c$l;)I

    move-result v9

    invoke-virtual {v5, v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;I)V

    :cond_1d
    invoke-static {v4}, Lio/flutter/view/c$l;->f(Lio/flutter/view/c$l;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v4}, Lio/flutter/view/c$l;->t(Lio/flutter/view/c$l;)Lio/flutter/view/c$l;

    move-result-object v9

    if-eqz v9, :cond_1e

    invoke-static {v4}, Lio/flutter/view/c$l;->t(Lio/flutter/view/c$l;)Lio/flutter/view/c$l;

    move-result-object v9

    invoke-static {v9}, Lio/flutter/view/c$l;->f(Lio/flutter/view/c$l;)Landroid/graphics/Rect;

    move-result-object v9

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget v11, v9, Landroid/graphics/Rect;->left:I

    neg-int v11, v11

    iget v9, v9, Landroid/graphics/Rect;->top:I

    neg-int v9, v9

    invoke-virtual {v10, v11, v9}, Landroid/graphics/Rect;->offset(II)V

    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    goto :goto_5

    :cond_1e
    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V

    :goto_5
    invoke-direct {p0, v1}, Lio/flutter/view/c;->y(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    sget-object v1, Lio/flutter/view/c$i;->q:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_20

    sget-object v1, Lio/flutter/view/c$i;->r:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_6

    :cond_1f
    const/4 v1, 0x0

    goto :goto_7

    :cond_20
    :goto_6
    const/4 v1, 0x1

    :goto_7
    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    sget-object v1, Lio/flutter/view/c$g;->k:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-static {v4}, Lio/flutter/view/c$l;->w(Lio/flutter/view/c$l;)Lio/flutter/view/c$h;

    move-result-object v1

    const/16 v9, 0x10

    if-eqz v1, :cond_21

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-static {v4}, Lio/flutter/view/c$l;->w(Lio/flutter/view/c$l;)Lio/flutter/view/c$h;

    move-result-object v10

    invoke-static {v10}, Lio/flutter/view/c$h;->a(Lio/flutter/view/c$h;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v9, v10}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    goto :goto_8

    :cond_21
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :goto_8
    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    :cond_22
    sget-object v1, Lio/flutter/view/c$g;->l:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-static {v4}, Lio/flutter/view/c$l;->x(Lio/flutter/view/c$l;)Lio/flutter/view/c$h;

    move-result-object v1

    const/16 v9, 0x20

    if-eqz v1, :cond_23

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-static {v4}, Lio/flutter/view/c$l;->x(Lio/flutter/view/c$l;)Lio/flutter/view/c$h;

    move-result-object v10

    invoke-static {v10}, Lio/flutter/view/c$h;->a(Lio/flutter/view/c$h;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v9, v10}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    goto :goto_9

    :cond_23
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :goto_9
    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    :cond_24
    sget-object v1, Lio/flutter/view/c$g;->m:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    const/16 v10, 0x2000

    const/16 v11, 0x1000

    if-nez v9, :cond_25

    sget-object v9, Lio/flutter/view/c$g;->o:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-nez v9, :cond_25

    sget-object v9, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-nez v9, :cond_25

    sget-object v9, Lio/flutter/view/c$g;->p:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_2e

    :cond_25
    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    sget-object v9, Lio/flutter/view/c$i;->C:Lio/flutter/view/c$i;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v9

    if-eqz v9, :cond_2a

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-nez v9, :cond_28

    sget-object v9, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_26

    goto :goto_a

    :cond_26
    invoke-direct {p0, v4}, Lio/flutter/view/c;->Z(Lio/flutter/view/c$l;)Z

    move-result v9

    if-eqz v9, :cond_27

    invoke-static {v4}, Lio/flutter/view/c$l;->c(Lio/flutter/view/c$l;)I

    move-result v9

    invoke-static {v9, v3, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v9

    goto :goto_b

    :cond_27
    const-string v9, "android.widget.ScrollView"

    goto :goto_c

    :cond_28
    :goto_a
    invoke-direct {p0, v4}, Lio/flutter/view/c;->Z(Lio/flutter/view/c$l;)Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-static {v4}, Lio/flutter/view/c$l;->c(Lio/flutter/view/c$l;)I

    move-result v9

    invoke-static {v3, v9, v3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object v9

    :goto_b
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    goto :goto_d

    :cond_29
    const-string v9, "android.widget.HorizontalScrollView"

    :goto_c
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_2a
    :goto_d
    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-nez v1, :cond_2b

    sget-object v1, Lio/flutter/view/c$g;->o:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_2c

    :cond_2b
    invoke-virtual {v5, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_2c
    sget-object v1, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-nez v1, :cond_2d

    sget-object v1, Lio/flutter/view/c$g;->p:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_2e

    :cond_2d
    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_2e
    sget-object v1, Lio/flutter/view/c$g;->q:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-nez v9, :cond_2f

    sget-object v9, Lio/flutter/view/c$g;->r:Lio/flutter/view/c$g;

    invoke-static {v4, v9}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v9

    if-eqz v9, :cond_31

    :cond_2f
    const-string v9, "android.widget.SeekBar"

    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-virtual {v5, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_30
    sget-object v1, Lio/flutter/view/c$g;->r:Lio/flutter/view/c$g;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result v1

    if-eqz v1, :cond_31

    invoke-virtual {v5, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_31
    sget-object v1, Lio/flutter/view/c$i;->z:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_32

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    :cond_32
    invoke-static {v4, v8}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    const/16 v8, 0x1c

    if-eqz v1, :cond_33

    invoke-static {v4}, Lio/flutter/view/c$l;->y(Lio/flutter/view/c$l;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    if-lt v6, v8, :cond_36

    invoke-static {v4}, Lio/flutter/view/c$l;->z(Lio/flutter/view/c$l;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    goto :goto_e

    :cond_33
    sget-object v1, Lio/flutter/view/c$i;->v:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-nez v1, :cond_36

    invoke-static {v4}, Lio/flutter/view/c$l;->A(Lio/flutter/view/c$l;)Ljava/lang/CharSequence;

    move-result-object v1

    if-ge v6, v8, :cond_35

    invoke-static {v4}, Lio/flutter/view/c$l;->B(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_35

    if-eqz v1, :cond_34

    move-object v7, v1

    :cond_34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lio/flutter/view/c$l;->B(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_35
    if-eqz v1, :cond_36

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_36
    :goto_e
    if-lt v6, v8, :cond_37

    invoke-static {v4}, Lio/flutter/view/c$l;->B(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_37

    invoke-static {v4}, Lio/flutter/view/c$l;->B(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTooltipText(Ljava/lang/CharSequence;)V

    :cond_37
    sget-object v1, Lio/flutter/view/c$i;->k:Lio/flutter/view/c$i;

    invoke-static {v4, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    sget-object v7, Lio/flutter/view/c$i;->A:Lio/flutter/view/c$i;

    invoke-static {v4, v7}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v7

    if-nez v1, :cond_39

    if-eqz v7, :cond_38

    goto :goto_f

    :cond_38
    const/4 v0, 0x0

    :cond_39
    :goto_f
    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    if-eqz v1, :cond_3b

    sget-object v0, Lio/flutter/view/c$i;->l:Lio/flutter/view/c$i;

    invoke-static {v4, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    sget-object v0, Lio/flutter/view/c$i;->s:Lio/flutter/view/c$i;

    invoke-static {v4, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    if-eqz v0, :cond_3a

    const-string v0, "android.widget.RadioButton"

    goto :goto_10

    :cond_3a
    const-string v0, "android.widget.CheckBox"

    goto :goto_10

    :cond_3b
    if-eqz v7, :cond_3c

    sget-object v0, Lio/flutter/view/c$i;->B:Lio/flutter/view/c$i;

    invoke-static {v4, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    const-string v0, "android.widget.Switch"

    :goto_10
    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    :cond_3c
    sget-object v0, Lio/flutter/view/c$i;->m:Lio/flutter/view/c$i;

    invoke-static {v4, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    if-lt v6, v8, :cond_3d

    sget-object v0, Lio/flutter/view/c$i;->t:Lio/flutter/view/c$i;

    invoke-static {v4, v0}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    :cond_3d
    iget-object v0, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz v0, :cond_3e

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    if-ne v0, p1, :cond_3e

    const/16 p1, 0x80

    goto :goto_11

    :cond_3e
    const/16 p1, 0x40

    :goto_11
    invoke-virtual {v5, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    invoke-static {v4}, Lio/flutter/view/c$l;->C(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3f

    invoke-static {v4}, Lio/flutter/view/c$l;->C(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/c$h;

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    invoke-static {v0}, Lio/flutter/view/c$h;->c(Lio/flutter/view/c$h;)I

    move-result v3

    invoke-static {v0}, Lio/flutter/view/c$h;->e(Lio/flutter/view/c$h;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V

    goto :goto_12

    :cond_3f
    invoke-static {v4}, Lio/flutter/view/c$l;->D(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_42

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/view/c$l;

    sget-object v1, Lio/flutter/view/c$i;->x:Lio/flutter/view/c$i;

    invoke-static {v0, v1}, Lio/flutter/view/c$l;->h(Lio/flutter/view/c$l;Lio/flutter/view/c$i;)Z

    move-result v1

    if-eqz v1, :cond_40

    goto :goto_13

    :cond_40
    invoke-static {v0}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v1

    if-eq v1, v2, :cond_41

    iget-object v1, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v0}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v3

    invoke-interface {v1, v3}, Lio/flutter/plugin/platform/k;->c(I)Landroid/view/View;

    move-result-object v1

    iget-object v3, p0, Lio/flutter/view/c;->e:Lio/flutter/plugin/platform/k;

    invoke-static {v0}, Lio/flutter/view/c$l;->e(Lio/flutter/view/c$l;)I

    move-result v4

    invoke-interface {v3, v4}, Lio/flutter/plugin/platform/k;->b(I)Z

    move-result v3

    if-nez v3, :cond_41

    invoke-virtual {v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    goto :goto_13

    :cond_41
    iget-object v1, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-static {v0}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result v0

    invoke-virtual {v5, v1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    goto :goto_13

    :cond_42
    return-object v5
.end method

.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    goto :goto_3

    :cond_0
    iget-object p1, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    if-eqz p1, :cond_1

    :goto_0
    invoke-static {p1}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, Lio/flutter/view/c;->createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lio/flutter/view/c;->k:Ljava/lang/Integer;

    if-eqz p1, :cond_2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public performAction(IILandroid/os/Bundle;)Z
    .locals 7

    const/high16 v0, 0x10000

    const/4 v1, 0x0

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->performAction(IILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p3, 0x80

    if-ne p2, p3, :cond_0

    iput-object v1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    :cond_0
    return p1

    :cond_1
    iget-object v2, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/view/c$l;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    return v3

    :cond_2
    const/4 v4, 0x4

    const/4 v5, 0x1

    sparse-switch p2, :sswitch_data_0

    sget p3, Lio/flutter/view/c;->B:I

    sub-int/2addr p2, p3

    iget-object p3, p0, Lio/flutter/view/c;->h:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/view/c$h;

    if-eqz p2, :cond_10

    iget-object p3, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object v0, Lio/flutter/view/c$g;->B:Lio/flutter/view/c$g;

    invoke-static {p2}, Lio/flutter/view/c$h;->g(Lio/flutter/view/c$h;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, v0, p2}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    return v5

    :sswitch_0
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->s:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_1
    invoke-direct {p0, v2, p1, p3}, Lio/flutter/view/c;->O(Lio/flutter/view/c$l;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :sswitch_2
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->C:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "ACTION_ARGUMENT_SELECTION_END_INT"

    const-string v1, "ACTION_ARGUMENT_SELECTION_START_INT"

    if-eqz p3, :cond_3

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v3, 0x1

    :cond_3
    const-string v4, "extent"

    const-string v6, "base"

    if-eqz v3, :cond_4

    invoke-virtual {p3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    goto :goto_0

    :cond_4
    invoke-static {v2}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v6, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lio/flutter/view/c$l;->k(Lio/flutter/view/c$l;)I

    move-result p3

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, v4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object v0, Lio/flutter/view/c$g;->v:Lio/flutter/view/c$g;

    invoke-virtual {p3, p1, v0, p2}, Lq8/a;->c(ILio/flutter/view/c$g;Ljava/lang/Object;)V

    iget-object p3, p0, Lio/flutter/view/c;->g:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/view/c$l;

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p1, p3}, Lio/flutter/view/c$l;->j(Lio/flutter/view/c$l;I)I

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lio/flutter/view/c$l;->l(Lio/flutter/view/c$l;I)I

    return v5

    :sswitch_4
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->x:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_5
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->y:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_6
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->w:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_7
    sget-object p2, Lio/flutter/view/c$g;->p:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_5

    :goto_1
    iget-object p3, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-virtual {p3, p1, p2}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    goto :goto_2

    :cond_5
    sget-object p2, Lio/flutter/view/c$g;->n:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_6

    goto :goto_1

    :cond_6
    sget-object p2, Lio/flutter/view/c$g;->r:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {v2}, Lio/flutter/view/c$l;->H(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v2, p3}, Lio/flutter/view/c$l;->r(Lio/flutter/view/c$l;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2}, Lio/flutter/view/c$l;->I(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object p3

    invoke-static {v2, p3}, Lio/flutter/view/c$l;->F(Lio/flutter/view/c$l;Ljava/util/List;)Ljava/util/List;

    invoke-direct {p0, p1, v4}, Lio/flutter/view/c;->R(II)V

    goto :goto_1

    :goto_2
    return v5

    :cond_7
    return v3

    :sswitch_8
    sget-object p2, Lio/flutter/view/c$g;->o:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_8

    :goto_3
    iget-object p3, p0, Lio/flutter/view/c;->b:Lq8/a;

    invoke-virtual {p3, p1, p2}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    goto :goto_4

    :cond_8
    sget-object p2, Lio/flutter/view/c$g;->m:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_9

    goto :goto_3

    :cond_9
    sget-object p2, Lio/flutter/view/c$g;->q:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {v2}, Lio/flutter/view/c$l;->E(Lio/flutter/view/c$l;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v2, p3}, Lio/flutter/view/c$l;->r(Lio/flutter/view/c$l;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2}, Lio/flutter/view/c$l;->G(Lio/flutter/view/c$l;)Ljava/util/List;

    move-result-object p3

    invoke-static {v2, p3}, Lio/flutter/view/c$l;->F(Lio/flutter/view/c$l;Ljava/util/List;)Ljava/util/List;

    invoke-direct {p0, p1, v4}, Lio/flutter/view/c;->R(II)V

    goto :goto_3

    :goto_4
    return v5

    :cond_a
    return v3

    :sswitch_9
    invoke-direct {p0, v2, p1, p3, v3}, Lio/flutter/view/c;->N(Lio/flutter/view/c$l;ILandroid/os/Bundle;Z)Z

    move-result p1

    return p1

    :sswitch_a
    invoke-direct {p0, v2, p1, p3, v5}, Lio/flutter/view/c;->N(Lio/flutter/view/c$l;ILandroid/os/Bundle;Z)Z

    move-result p1

    return p1

    :sswitch_b
    iget-object p2, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-eqz p2, :cond_b

    invoke-static {p2}, Lio/flutter/view/c$l;->a(Lio/flutter/view/c$l;)I

    move-result p2

    if-ne p2, p1, :cond_b

    iput-object v1, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    :cond_b
    iget-object p2, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_c

    iput-object v1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    :cond_c
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->A:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    invoke-direct {p0, p1, v0}, Lio/flutter/view/c;->R(II)V

    return v5

    :sswitch_c
    iget-object p2, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    if-nez p2, :cond_d

    iget-object p2, p0, Lio/flutter/view/c;->a:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_d
    iput-object v2, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->z:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    const p2, 0x8000

    invoke-direct {p0, p1, p2}, Lio/flutter/view/c;->R(II)V

    sget-object p2, Lio/flutter/view/c$g;->q:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p2

    if-nez p2, :cond_e

    sget-object p2, Lio/flutter/view/c$g;->r:Lio/flutter/view/c$g;

    invoke-static {v2, p2}, Lio/flutter/view/c$l;->o(Lio/flutter/view/c$l;Lio/flutter/view/c$g;)Z

    move-result p2

    if-eqz p2, :cond_f

    :cond_e
    invoke-direct {p0, p1, v4}, Lio/flutter/view/c;->R(II)V

    :cond_f
    return v5

    :sswitch_d
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->l:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :sswitch_e
    iget-object p2, p0, Lio/flutter/view/c;->b:Lq8/a;

    sget-object p3, Lio/flutter/view/c$g;->k:Lio/flutter/view/c$g;

    invoke-virtual {p2, p1, p3}, Lq8/a;->b(ILio/flutter/view/c$g;)V

    return v5

    :cond_10
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_e
        0x20 -> :sswitch_d
        0x40 -> :sswitch_c
        0x80 -> :sswitch_b
        0x100 -> :sswitch_a
        0x200 -> :sswitch_9
        0x1000 -> :sswitch_8
        0x2000 -> :sswitch_7
        0x4000 -> :sswitch_6
        0x8000 -> :sswitch_5
        0x10000 -> :sswitch_4
        0x20000 -> :sswitch_3
        0x100000 -> :sswitch_2
        0x200000 -> :sswitch_1
        0x1020036 -> :sswitch_0
    .end sparse-switch
.end method

.method public x(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    iget-object p2, p0, Lio/flutter/view/c;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    invoke-virtual {p2, p1, p3}, Lio/flutter/view/AccessibilityViewEmbedder;->getRecordFlutterId(Landroid/view/View;Landroid/view/accessibility/AccessibilityRecord;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p2

    const/16 p3, 0x8

    const/4 v0, 0x0

    if-eq p2, p3, :cond_5

    const/16 p3, 0x80

    if-eq p2, p3, :cond_4

    const p3, 0x8000

    if-eq p2, p3, :cond_3

    const/high16 p1, 0x10000

    if-eq p2, p1, :cond_2

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lio/flutter/view/c;->k:Ljava/lang/Integer;

    iput-object v0, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    goto :goto_0

    :cond_3
    iput-object p1, p0, Lio/flutter/view/c;->j:Ljava/lang/Integer;

    iput-object v0, p0, Lio/flutter/view/c;->i:Lio/flutter/view/c$l;

    goto :goto_0

    :cond_4
    iput-object v0, p0, Lio/flutter/view/c;->o:Lio/flutter/view/c$l;

    goto :goto_0

    :cond_5
    iput-object p1, p0, Lio/flutter/view/c;->k:Ljava/lang/Integer;

    iput-object v0, p0, Lio/flutter/view/c;->m:Lio/flutter/view/c$l;

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
