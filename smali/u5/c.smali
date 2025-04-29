.class public final Lu5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/a;


# static fields
.field public static final b:Ll5/b$b;


# instance fields
.field private final a:Li5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ll5/b$b;->k:Ll5/b$b;

    sput-object v0, Lu5/c;->b:Ll5/b$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu5/c;->b:Ll5/b$b;

    invoke-virtual {v0}, Ll5/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Li5/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Li5/b;-><init>([BZ)V

    iput-object v0, p0, Lu5/c;->a:Li5/b;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, Lu5/p;->c(I)[B

    move-result-object v0

    iget-object v1, p0, Lu5/c;->a:Li5/b;

    invoke-virtual {v1, v0, p1, p2}, Li5/b;->b([B[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lu5/c;->a:Li5/b;

    invoke-virtual {v1, v0, p1, p2}, Li5/b;->a([B[B[B)[B

    move-result-object p1

    return-object p1
.end method
