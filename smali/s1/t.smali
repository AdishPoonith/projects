.class public final synthetic Ls1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# static fields
.field public static final synthetic j:Ls1/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/t;

    invoke-direct {v0}, Ls1/t;-><init>()V

    sput-object v0, Ls1/t;->j:Ls1/t;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lt1/o1;

    check-cast p1, Lp3/d;

    invoke-direct {v0, p1}, Lt1/o1;-><init>(Lp3/d;)V

    return-object v0
.end method
