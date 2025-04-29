.class public final Lg5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lg5/j;

.field public static final c:Lg5/j;

.field public static final d:Lg5/j;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg5/j;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg5/j;->b:Lg5/j;

    new-instance v0, Lg5/j;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg5/j;->c:Lg5/j;

    new-instance v0, Lg5/j;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lg5/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg5/j;->d:Lg5/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/j;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg5/j;->a:Ljava/lang/String;

    return-object v0
.end method
