.class public final Lp5/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lp5/c$a;

.field public static final c:Lp5/c$a;

.field public static final d:Lp5/c$a;

.field public static final e:Lp5/c$a;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp5/c$a;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lp5/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp5/c$a;->b:Lp5/c$a;

    new-instance v0, Lp5/c$a;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lp5/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp5/c$a;->c:Lp5/c$a;

    new-instance v0, Lp5/c$a;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lp5/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp5/c$a;->d:Lp5/c$a;

    new-instance v0, Lp5/c$a;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lp5/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp5/c$a;->e:Lp5/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/c$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp5/c$a;->a:Ljava/lang/String;

    return-object v0
.end method
