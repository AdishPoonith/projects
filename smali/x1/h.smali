.class public final synthetic Lx1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/i$a$a;


# static fields
.field public static final synthetic a:Lx1/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/h;

    invoke-direct {v0}, Lx1/h;-><init>()V

    sput-object v0, Lx1/h;->a:Lx1/h;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Constructor;
    .locals 1

    invoke-static {}, Lx1/i;->d()Ljava/lang/reflect/Constructor;

    move-result-object v0

    return-object v0
.end method
