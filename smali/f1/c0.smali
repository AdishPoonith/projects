.class public final Lf1/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/c0$a;
    }
.end annotation


# static fields
.field public static final e:Lf1/c0$a;

.field private static final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lp0/r0;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/StringBuilder;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf1/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/c0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lf1/c0;->e:Lf1/c0$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lf1/c0;->f:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lp0/r0;Ljava/lang/String;)V
    .locals 2

    const-string v0, "behavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x3

    iput v1, p0, Lf1/c0;->d:I

    iput-object p1, p0, Lf1/c0;->a:Lp0/r0;

    sget-object p1, Lf1/m0;->a:Lf1/m0;

    invoke-static {p2, v0}, Lf1/m0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "FacebookSDK."

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lf1/c0;->b:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lf1/c0;->c:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final synthetic a()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lf1/c0;->f:Ljava/util/HashMap;

    return-object v0
.end method

.method private final g()Z
    .locals 1

    sget-object v0, Lp0/f0;->a:Lp0/f0;

    iget-object v0, p0, Lf1/c0;->a:Lp0/r0;

    invoke-static {v0}, Lp0/f0;->H(Lp0/r0;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf1/c0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/c0;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf1/c0;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/c0;->c:Ljava/lang/StringBuilder;

    sget-object v1, Lkotlin/jvm/internal/v;->a:Lkotlin/jvm/internal/v;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const-string p1, "  %s:\t%s\n"

    invoke-virtual {p0, p1, v0}, Lf1/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lf1/c0;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "contents.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lf1/c0;->f(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lf1/c0;->c:Ljava/lang/StringBuilder;

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 4

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf1/c0;->e:Lf1/c0$a;

    iget-object v1, p0, Lf1/c0;->a:Lp0/r0;

    iget v2, p0, Lf1/c0;->d:I

    iget-object v3, p0, Lf1/c0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, p1}, Lf1/c0$a;->a(Lp0/r0;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
