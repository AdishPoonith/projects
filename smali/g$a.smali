.class public final Lg$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lg$a;

.field private static final b:Ls9/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls9/h<",
            "Lh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg$a;

    invoke-direct {v0}, Lg$a;-><init>()V

    sput-object v0, Lg$a;->a:Lg$a;

    sget-object v0, Lg$a$a;->j:Lg$a$a;

    invoke-static {v0}, Ls9/i;->a(Lda/a;)Ls9/h;

    move-result-object v0

    sput-object v0, Lg$a;->b:Ls9/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg;Ljava/lang/Object;Lr8/a$e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg$a;->f(Lg;Ljava/lang/Object;Lr8/a$e;)V

    return-void
.end method

.method public static synthetic b(Lg;Ljava/lang/Object;Lr8/a$e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg$a;->e(Lg;Ljava/lang/Object;Lr8/a$e;)V

    return-void
.end method

.method private static final e(Lg;Ljava/lang/Object;Lr8/a$e;)V
    .locals 1

    const-string v0, "reply"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type <root>.ToggleMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ld;

    :try_start_0
    invoke-interface {p0, p1}, Lg;->a(Ld;)V

    const/4 p0, 0x0

    invoke-static {p0}, Lt9/n;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc;->a(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p2, p0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final f(Lg;Ljava/lang/Object;Lr8/a$e;)V
    .locals 0

    const-string p1, "reply"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p0}, Lg;->isEnabled()Lb;

    move-result-object p0

    invoke-static {p0}, Lt9/n;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lc;->a(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p2, p0}, Lr8/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c()Lr8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr8/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lg$a;->b:Ls9/h;

    invoke-interface {v0}, Ls9/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr8/i;

    return-object v0
.end method

.method public final d(Lr8/c;Lg;)V
    .locals 4

    const-string v0, "binaryMessenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr8/a;

    invoke-virtual {p0}, Lg$a;->c()Lr8/i;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.WakelockPlusApi.toggle"

    invoke-direct {v0, p1, v2, v1}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    new-instance v2, Lf;

    invoke-direct {v2, p2}, Lf;-><init>(Lg;)V

    invoke-virtual {v0, v2}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_0
    new-instance v0, Lr8/a;

    invoke-virtual {p0}, Lg$a;->c()Lr8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.WakelockPlusApi.isEnabled"

    invoke-direct {v0, p1, v3, v2}, Lr8/a;-><init>(Lr8/c;Ljava/lang/String;Lr8/i;)V

    if-eqz p2, :cond_1

    new-instance p1, Le;

    invoke-direct {p1, p2}, Le;-><init>(Lg;)V

    invoke-virtual {v0, p1}, Lr8/a;->e(Lr8/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr8/a;->e(Lr8/a$d;)V

    :goto_1
    return-void
.end method
