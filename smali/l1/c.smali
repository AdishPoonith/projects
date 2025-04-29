.class public final synthetic Ll1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Ll1/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/c;

    invoke-direct {v0}, Ll1/c;-><init>()V

    sput-object v0, Ll1/c;->j:Ll1/c;

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

    check-cast p1, Ll1/a;

    check-cast p2, Ll1/a;

    invoke-static {p1, p2}, Ll1/e;->a(Ll1/a;Ll1/a;)I

    move-result p1

    return p1
.end method
