.class public final synthetic Lq2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Lq2/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lq2/d;

    invoke-direct {v0}, Lq2/d;-><init>()V

    sput-object v0, Lq2/d;->j:Lq2/d;

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

    check-cast p1, Lq2/c$b;

    check-cast p2, Lq2/c$b;

    invoke-static {p1, p2}, Lq2/c$b;->a(Lq2/c$b;Lq2/c$b;)I

    move-result p1

    return p1
.end method
