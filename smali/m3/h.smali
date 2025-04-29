.class public final Lm3/h;
.super Ld3/g;
.source "SourceFile"


# instance fields
.field private final o:Lp3/a0;

.field private final p:Lm3/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "WebvttDecoder"

    invoke-direct {p0, v0}, Ld3/g;-><init>(Ljava/lang/String;)V

    new-instance v0, Lp3/a0;

    invoke-direct {v0}, Lp3/a0;-><init>()V

    iput-object v0, p0, Lm3/h;->o:Lp3/a0;

    new-instance v0, Lm3/c;

    invoke-direct {v0}, Lm3/c;-><init>()V

    iput-object v0, p0, Lm3/h;->p:Lm3/c;

    return-void
.end method

.method private static C(Lp3/a0;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ne v2, v1, :cond_3

    invoke-virtual {p0}, Lp3/a0;->f()I

    move-result v3

    invoke-virtual {p0}, Lp3/a0;->r()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const-string v4, "STYLE"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    const-string v4, "NOTE"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v3}, Lp3/a0;->T(I)V

    return v2
.end method

.method private static D(Lp3/a0;)V
    .locals 1

    :goto_0
    invoke-virtual {p0}, Lp3/a0;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected A([BIZ)Ld3/h;
    .locals 1

    iget-object p3, p0, Lm3/h;->o:Lp3/a0;

    invoke-virtual {p3, p1, p2}, Lp3/a0;->R([BI)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object p2, p0, Lm3/h;->o:Lp3/a0;

    invoke-static {p2}, Lm3/i;->e(Lp3/a0;)V
    :try_end_0
    .catch Ls1/u2; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object p2, p0, Lm3/h;->o:Lp3/a0;

    invoke-virtual {p2}, Lp3/a0;->r()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    :goto_1
    iget-object p3, p0, Lm3/h;->o:Lp3/a0;

    invoke-static {p3}, Lm3/h;->C(Lp3/a0;)I

    move-result p3

    if-eqz p3, :cond_5

    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    iget-object p3, p0, Lm3/h;->o:Lp3/a0;

    invoke-static {p3}, Lm3/h;->D(Lp3/a0;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    if-ne p3, v0, :cond_4

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lm3/h;->o:Lp3/a0;

    invoke-virtual {p3}, Lp3/a0;->r()Ljava/lang/String;

    iget-object p3, p0, Lm3/h;->p:Lm3/c;

    iget-object v0, p0, Lm3/h;->o:Lp3/a0;

    invoke-virtual {p3, v0}, Lm3/c;->d(Lp3/a0;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    new-instance p1, Ld3/j;

    const-string p2, "A style block was found after the first cue."

    invoke-direct {p1, p2}, Ld3/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 v0, 0x3

    if-ne p3, v0, :cond_1

    iget-object p3, p0, Lm3/h;->o:Lp3/a0;

    invoke-static {p3, p1}, Lm3/f;->n(Lp3/a0;Ljava/util/List;)Lm3/e;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance p1, Lm3/k;

    invoke-direct {p1, p2}, Lm3/k;-><init>(Ljava/util/List;)V

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ld3/j;

    invoke-direct {p2, p1}, Ld3/j;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
