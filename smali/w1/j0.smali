.class public final synthetic Lw1/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/g0$c;


# static fields
.field public static final synthetic a:Lw1/j0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw1/j0;

    invoke-direct {v0}, Lw1/j0;-><init>()V

    sput-object v0, Lw1/j0;->a:Lw1/j0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;)Lw1/g0;
    .locals 0

    invoke-static {p1}, Lw1/k0;->o(Ljava/util/UUID;)Lw1/g0;

    move-result-object p1

    return-object p1
.end method
