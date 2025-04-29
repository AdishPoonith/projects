.class public Ln6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/p;


# static fields
.field private static final a:Ln6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln6/n;

    invoke-direct {v0}, Ln6/n;-><init>()V

    sput-object v0, Ln6/n;->a:Ln6/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Ln6/n;
    .locals 1

    sget-object v0, Ln6/n;->a:Ln6/n;

    return-object v0
.end method


# virtual methods
.method public a(Ld7/b0;)Ld7/b0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ld7/b0;Lw5/q;)Ld7/b0;
    .locals 0

    invoke-static {p2, p1}, Lm6/v;->d(Lw5/q;Ld7/b0;)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ld7/b0;Ld7/b0;)Ld7/b0;
    .locals 0

    return-object p2
.end method
