.class public final Lla/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lla/a1;

.field private static final b:Lla/g0;

.field private static final c:Lla/g0;

.field private static final d:Lla/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lla/a1;

    invoke-direct {v0}, Lla/a1;-><init>()V

    sput-object v0, Lla/a1;->a:Lla/a1;

    sget-object v0, Lkotlinx/coroutines/scheduling/c;->r:Lkotlinx/coroutines/scheduling/c;

    sput-object v0, Lla/a1;->b:Lla/g0;

    sget-object v0, Lla/y2;->l:Lla/y2;

    sput-object v0, Lla/a1;->c:Lla/g0;

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->m:Lkotlinx/coroutines/scheduling/b;

    sput-object v0, Lla/a1;->d:Lla/g0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lla/g0;
    .locals 1

    sget-object v0, Lla/a1;->b:Lla/g0;

    return-object v0
.end method

.method public static final b()Lla/g0;
    .locals 1

    sget-object v0, Lla/a1;->d:Lla/g0;

    return-object v0
.end method

.method public static final c()Lla/g2;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/s;->c:Lla/g2;

    return-object v0
.end method
