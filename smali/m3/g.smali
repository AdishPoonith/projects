.class public final synthetic Lm3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Lm3/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm3/g;

    invoke-direct {v0}, Lm3/g;-><init>()V

    sput-object v0, Lm3/g;->j:Lm3/g;

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

    check-cast p1, Lm3/f$b;

    check-cast p2, Lm3/f$b;

    invoke-static {p1, p2}, Lm3/f$b;->a(Lm3/f$b;Lm3/f$b;)I

    move-result p1

    return p1
.end method
