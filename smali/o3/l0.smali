.class public final synthetic Lo3/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Lo3/l0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/l0;

    invoke-direct {v0}, Lo3/l0;-><init>()V

    sput-object v0, Lo3/l0;->j:Lo3/l0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lo3/n0$b;

    check-cast p2, Lo3/n0$b;

    invoke-static {p1, p2}, Lo3/n0;->a(Lo3/n0$b;Lo3/n0$b;)I

    move-result p1

    return p1
.end method
